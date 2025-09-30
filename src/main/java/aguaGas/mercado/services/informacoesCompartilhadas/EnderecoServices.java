package aguaGas.mercado.services.informacoesCompartilhadas;

import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoDTO;
import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoMapper;
import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import aguaGas.mercado.repository.informacoesCompartilhadas.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoServices {

    private final EnderecoRepository enderecoRepository;
    private final EnderecoMapper enderecoMapper;

    public EnderecoServices(EnderecoRepository enderecoRepository, EnderecoMapper enderecoMapper) {
        this.enderecoRepository = enderecoRepository;
        this.enderecoMapper = enderecoMapper;
    }

    // Salvar
    public EnderecoDTO salvarEndereco(EnderecoDTO enderecoDTO) {
        EnderecoModel enderecoSalvo = enderecoMapper.map(enderecoDTO);
        enderecoSalvo.setEnderecoAtivo(true);

        enderecoSalvo = enderecoRepository.save(enderecoSalvo);
        return enderecoMapper.map(enderecoSalvo);
    }

    // Atualizar
    public EnderecoDTO atualizarEndereco(Long idEndereco, EnderecoDTO enderecoDTO) {
        Optional<EnderecoModel> optionalEndereco = enderecoRepository.findById(idEndereco);
        if (optionalEndereco.isPresent()) {
            EnderecoModel enderecoExistente = optionalEndereco.get();
            enderecoExistente.atualizarEnderecoComDTO(enderecoDTO);
            EnderecoModel enderecoSalvo = enderecoRepository.save(enderecoExistente);
            return enderecoMapper.map(enderecoSalvo);
        }
        return null;
    }

    // Listar todos
    public List<EnderecoDTO> listarTodosEnderecos() {
        List<EnderecoModel> todosEndereco = enderecoRepository.findByEnderecoAtivoTrue();
        return todosEndereco.stream()
                .map(enderecoMapper::map)
                .collect(Collectors.toList());
    }

    // Listar um por vez
    public EnderecoDTO buscarEnderecoPorVez(Long idEndereco) {
        Optional<EnderecoModel> enderecoModelOptional = enderecoRepository.findById(idEndereco);
        return enderecoModelOptional.map(enderecoMapper::map).orElse(null);
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
