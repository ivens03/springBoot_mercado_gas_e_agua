package aguaGas.mercado.services.informacoesCompartilhadas;

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
        LocalDateTime dataLocal = LocalDateTime.now();
        return fornecedoresRepository.save(fornecedoresModel);
    }

    // Atualizar
    public FornecedoresModel atualizarFornecedor(FornecedoresModel fornecedoresModel) {
        return fornecedoresRepository.save(fornecedoresModel);
    }

    // Listar todos
    public List<FornecedoresModel> listarFornecedores() {
        return fornecedoresRepository.findByAtivoTrue();
    }

    // Listar um por vez
    public Optional<FornecedoresModel> listarFornecedorPorId(Long id_fornecedor) {
        return fornecedoresRepository.findById(id_fornecedor);
    }

    //  Apagar
    @Transactional
    public void apagarFornecedor(Long id_fornecedor) {
        fornecedoresRepository.findById(id_fornecedor).ifPresent( fornecedor -> {
            fornecedor.setFornecedor_ativo(false);
            fornecedoresRepository.save(fornecedor);
        });
    }
}
