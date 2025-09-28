package aguaGas.mercado.dto.informacoesCompartilhadas;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import org.springframework.stereotype.Component;

@Component
public class EnderecoMapper {

    public EnderecoModel map(EnderecoDTO enderecoDTO) {

        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setIdEndereco(enderecoDTO.getIdEndereco());
        enderecoModel.setEstado(enderecoDTO.getEstado());
        enderecoModel.setCidade(enderecoDTO.getCidade());
        enderecoModel.setLogradouro(enderecoDTO.getLogradouro());
        enderecoModel.setCep(enderecoDTO.getCep());
        enderecoModel.setBairro(enderecoDTO.getBairro());
        enderecoModel.setNumeroLogradouro(enderecoDTO.getNumeroLogradouro());
        enderecoModel.setComplemento(enderecoDTO.getComplemento());
        enderecoModel.setEnderecoAtivo(enderecoDTO.getEnderecoAtivo());

        return enderecoModel;
    }

    public EnderecoDTO map(EnderecoModel enderecoModel) {

        EnderecoDTO enderecoDTO = new EnderecoDTO();
        enderecoDTO.setIdEndereco(enderecoModel.getIdEndereco());
        enderecoDTO.setEstado(enderecoModel.getEstado());
        enderecoDTO.setCidade(enderecoModel.getCidade());
        enderecoDTO.setLogradouro(enderecoModel.getLogradouro());
        enderecoDTO.setCep(enderecoModel.getCep());
        enderecoDTO.setBairro(enderecoModel.getBairro());
        enderecoDTO.setNumeroLogradouro(enderecoModel.getNumeroLogradouro());
        enderecoDTO.setComplemento(enderecoModel.getComplemento());
        enderecoDTO.setEnderecoAtivo(enderecoModel.getEnderecoAtivo());

        return enderecoDTO;

    }
}
