package aguaGas.mercado.services.fornecedor;

import aguaGas.mercado.dto.fornecedor.FornecedoresDTO;
import aguaGas.mercado.dto.fornecedor.FornecedoresMapper;
import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import aguaGas.mercado.repository.fornecedor.FornecedoresRepository;
import aguaGas.mercado.services.informacoesCompartilhadas.EnderecoServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FornecedoresServices {

    private final FornecedoresRepository fornecedoresRepository;
    private final FornecedoresMapper fornecedoresMapper;
    private final EnderecoServices enderecoServices;

    public FornecedoresServices(FornecedoresRepository fornecedoresRepository, FornecedoresMapper fornecedoresMapper, EnderecoServices enderecoServices) {
        this.fornecedoresRepository = fornecedoresRepository;
        this.fornecedoresMapper = fornecedoresMapper;
        this.enderecoServices = enderecoServices;
    }

    // Salvar
    @Transactional
    public FornecedoresDTO salvarFornecedor(FornecedoresDTO fornecedoresDTO) {
        FornecedoresModel fornecedorParaSalvar = fornecedoresMapper.map(fornecedoresDTO);
        fornecedorParaSalvar.setFornecedorAtivo(true);
        fornecedorParaSalvar.getEndereco().setEnderecoAtivo(true);
        FornecedoresModel fornecedorSalvo = fornecedoresRepository.save(fornecedorParaSalvar);
        return fornecedoresMapper.map(fornecedorSalvo);
    }

    // Atualizar
    public FornecedoresDTO atualizarFornecedor(Long idFornecedor, FornecedoresDTO fornecedoresDTO) {
        Optional<FornecedoresModel> optionalFornecedore = fornecedoresRepository.findById(idFornecedor);
        if (optionalFornecedore.isPresent()) {
            FornecedoresModel fornecedoreExistente = optionalFornecedore.get();
            fornecedoreExistente.atualizarFornecedorComDTO(fornecedoresDTO);
            FornecedoresModel fornecedoreSalvar = fornecedoresRepository.save(fornecedoreExistente);
            return fornecedoresMapper.map(fornecedoreSalvar);
        }
        return null;
    }

    // Listar todos
    public List<FornecedoresDTO> listarFornecedores() {
        List<FornecedoresModel> todosFornecedores = fornecedoresRepository.findByFornecedorAtivoTrue();
        return todosFornecedores.stream()
                .map(fornecedoresMapper::map)
                .collect(Collectors.toList());
    }

    // Listar um por vez
    public FornecedoresDTO listarFornecedorPorId(Long idFornecedor) {
        Optional<FornecedoresModel> fornecedoresModelOptional = fornecedoresRepository.findById(idFornecedor);
        return fornecedoresModelOptional.map(fornecedoresMapper::map)
                .orElse(null);
    }

    //  Apagar
    @Transactional
    public void apagarFornecedor(Long idFornecedor) {
        fornecedoresRepository.findById(idFornecedor).ifPresent( fornecedor -> {
            fornecedor.setFornecedorAtivo(false);
            fornecedoresRepository.save(fornecedor);
        });
    }
}