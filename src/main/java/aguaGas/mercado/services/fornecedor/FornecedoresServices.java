package aguaGas.mercado.services.fornecedor;

import aguaGas.mercado.dto.fornecedor.FornecedoresDTO;
import aguaGas.mercado.dto.fornecedor.FornecedoresMapper;
import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoDTO;
import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import aguaGas.mercado.repository.fornecedor.FornecedoresRepository;
import aguaGas.mercado.services.informacoesCompartilhadas.EnderecoServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    public FornecedoresModel atualizarFornecedor(FornecedoresModel fornecedoresModel) {
        return fornecedoresRepository.save(fornecedoresModel);
    }

    // Listar todos
    public List<FornecedoresModel> listarFornecedores() {
        return fornecedoresRepository.findByFornecedorAtivoTrue();
    }

    // Listar um por vez
    public Optional<FornecedoresModel> listarFornecedorPorId(Long idFornecedor) {
        return fornecedoresRepository.findById(idFornecedor);
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