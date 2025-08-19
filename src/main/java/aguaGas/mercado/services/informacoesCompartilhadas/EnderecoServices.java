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
        enderecoModel.setEndereco_ativo(true);
        return enderecoRepository.save(enderecoModel);
    }

    // Atualizar
    public EnderecoModel atualizarEndereco(EnderecoModel enderecoModel) {
        return enderecoRepository.save(enderecoModel);
    }

    // Listar todos
    public List<EnderecoModel> listarTodosEnderecos() {
        return enderecoRepository.findByEndereco_ativoTrue();
    }

    // Listar um por vez
    public Optional<EnderecoModel> buscarEnderecoPorVez(Long id_endereco) {
        return enderecoRepository.findById(id_endereco);
    }

    // Delete logico
    @Transactional
    public void apagarEndereco(Long id_endereco) {
        enderecoRepository.findById(id_endereco).ifPresent(endereco -> {
            endereco.setEndereco_ativo(false);
            enderecoRepository.save(endereco);
        });
    }
}
