package aguaGas.mercado.dto.fornecedor;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import org.springframework.stereotype.Component;

@Component
public class FornecedoresMapper {

    public FornecedoresModel map(FornecedoresDTO fornecedoresDTO) {

        FornecedoresModel fornecedoresModel = new FornecedoresModel();

        fornecedoresModel.setIdFornecedor(fornecedoresDTO.getIdFornecedor());
        fornecedoresModel.setNomeFornecedor(fornecedoresDTO.getNomeFornecedor());
        fornecedoresModel.setCnpjFornecedor(fornecedoresDTO.getCnpjFornecedor());
        fornecedoresModel.setTelefoneFornecedor(fornecedoresDTO.getTelefoneFornecedor());
        fornecedoresModel.setEmailFornecedor(fornecedoresDTO.getEmailFornecedor());
        fornecedoresModel.setFornecedorAtivo(fornecedoresDTO.isFornecedorAtivo());

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

        return fornecedoresDTO;
    }

}
