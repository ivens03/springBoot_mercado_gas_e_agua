package aguaGas.mercado.services.informacoesCompartilhadas;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import aguaGas.mercado.repository.informacoesCompartilhadas.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServices {

    private final EnderecoRepository enderecoRepository;

    public EnderecoServices(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    // Salvar
    public EnderecoModel salvarEndereco(EnderecoModel enderecoModel) {
        enderecoModel.setEnderecoAtivo(true);
        return enderecoRepository.save(enderecoModel);
    }

    // Atualizar
    public EnderecoModel atualizarEndereco(EnderecoModel enderecoModel) {
        return enderecoRepository.save(enderecoModel);
    }

    // Listar todos
    public List<EnderecoModel> listarTodosEnderecos() {
        return enderecoRepository.findByEnderecoAtivoTrue();
    }

    // Listar um por vez
    public Optional<EnderecoModel> buscarEnderecoPorVez(Long idEndereco) {
        return enderecoRepository.findById(idEndereco);
    }

    // Delete logico
    @Transactional
    public void apagarEndereco(Long idEndereco) {
        enderecoRepository.findById(idEndereco).ifPresent(endereco -> {
            endereco.setEnderecoAtivo(false);
            enderecoRepository.save(endereco);
        });
    }
}
