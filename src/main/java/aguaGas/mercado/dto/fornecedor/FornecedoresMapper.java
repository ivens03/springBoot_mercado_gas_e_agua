package aguaGas.mercado.dto.fornecedor;

import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoMapper;
import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import org.springframework.stereotype.Component;

@Component
public class FornecedoresMapper {

    private final EnderecoMapper enderecoMapper;

    public FornecedoresMapper(EnderecoMapper enderecoMapper) {
        this.enderecoMapper = enderecoMapper;
    }

    public FornecedoresModel map(FornecedoresDTO fornecedoresDTO) {

        FornecedoresModel fornecedoresModel = new FornecedoresModel();

        fornecedoresModel.setIdFornecedor(fornecedoresDTO.getIdFornecedor());
        fornecedoresModel.setNomeFornecedor(fornecedoresDTO.getNomeFornecedor());
        fornecedoresModel.setCnpjFornecedor(fornecedoresDTO.getCnpjFornecedor());
        fornecedoresModel.setTelefoneFornecedor(fornecedoresDTO.getTelefoneFornecedor());
        fornecedoresModel.setEmailFornecedor(fornecedoresDTO.getEmailFornecedor());
        fornecedoresModel.setFornecedorAtivo(fornecedoresDTO.isFornecedorAtivo());

        if (fornecedoresDTO.getEnderecoDTO() != null) {
            fornecedoresModel.setEndereco(enderecoMapper.map(fornecedoresDTO.getEnderecoDTO()));
        }

        return fornecedoresModel;
    }

    public FornecedoresDTO map(FornecedoresModel fornecedoresModel) {
        FornecedoresDTO fornecedoresDTO = new FornecedoresDTO();

        fornecedoresDTO.setIdFornecedor(fornecedoresModel.getIdFornecedor());
        fornecedoresDTO.setNomeFornecedor(fornecedoresModel.getNomeFornecedor());
        fornecedoresDTO.setCnpjFornecedor(fornecedoresModel.getCnpjFornecedor());
        fornecedoresDTO.setTelefoneFornecedor(fornecedoresModel.getTelefoneFornecedor());
        fornecedoresDTO.setEmailFornecedor(fornecedoresModel.getEmailFornecedor());
        fornecedoresDTO.setFornecedorAtivo(fornecedoresModel.isFornecedorAtivo());

        if (fornecedoresModel.getEndereco() != null) {
            fornecedoresDTO.setEnderecoDTO(enderecoMapper.map(fornecedoresModel.getEndereco()));
        }

        return fornecedoresDTO;
    }

}
