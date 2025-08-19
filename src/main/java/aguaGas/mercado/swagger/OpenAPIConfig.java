package aguaGas.mercado.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("Projeto de estudo de um mercado de agua e gas. Gerenciando preços de fornecedores, relatórios comerciais e analise com  WPP")
            .version("0.0.0")
            .description("caso de estudo")
        );
    }
}
