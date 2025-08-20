package aguaGas.mercado.services.fornecedor;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import aguaGas.mercado.repository.fornecedor.FornecedoresRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedoresServices {

    private final FornecedoresRepository fornecedoresRepository;

    public FornecedoresServices(FornecedoresRepository fornecedoresRepository) {
        this.fornecedoresRepository = fornecedoresRepository;
    }

    // Salvar
    public FornecedoresModel salvarFornecedor(FornecedoresModel fornecedoresModel) {
        fornecedoresModel.setDiaRegistroDasInformacoes(LocalDateTime.now());
        fornecedoresModel.setFornecedorAtivo(true);
        return fornecedoresRepository.save(fornecedoresModel);
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
