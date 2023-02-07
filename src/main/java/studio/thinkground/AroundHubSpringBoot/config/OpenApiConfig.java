package studio.thinkground.AroundHubSpringBoot.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger springdoc-ui 구성 파일
 */
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Springdoc 테스트")
                .description("Springdoc을 사용한 Swagger UI 테스트")
                .version("1.0.0");
    }

//    @Bean
//    public GroupedOpenApi mobile(){
//        return GroupedOpenApi.builder()
//                .group("mobile")
//                .pathsToMatch("/mobile/**")
//                .packagesToScan("studio.thinkground.AroundHubSpringBoot")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi web(){
//        return GroupedOpenApi.builder()
//                .group("web")
//                .pathsToMatch("/**")
//                .pathsToExclude("/mobile/**")
//                .packagesToScan("studio.thinkground.AroundHubSpringBoot")
//                .build();
//    }
}