package aguaGas.mercado;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import aguaGas.mercado.repository.informacoesCompartilhadas.EnderecoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class EnderecoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Test
    public void testCriarEndereco() throws Exception {
        // Dado
        EnderecoModel endereco = new EnderecoModel();
        endereco.setEstado("São Paulo");
        endereco.setCidade("São Paulo");
        endereco.setLogradouro("Avenida Paulista");
        endereco.setCep("01310-100");
        endereco.setBairro("Bela Vista");
        endereco.setNumeroLogradouro(1000);
        endereco.setComplemento("Apartamento 101");

        ResultActions result = mockMvc.perform(post("/endereco")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(endereco)));

        result.andExpect(status().isOk())
                .andExpect(jsonPath("$.estado").value("São Paulo"))
                .andExpect(jsonPath("$.cidade").value("São Paulo"))
                .andExpect(jsonPath("$.logradouro").value("Avenida Paulista"));
    }

}
