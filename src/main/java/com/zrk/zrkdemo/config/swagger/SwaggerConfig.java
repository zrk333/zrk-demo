package com.zrk.zrkdemo.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2020/03/12
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.host:}")
    private String host;

    /**
     * 暂时需要手动设置
     * @return
     */
    @Bean
    public Docket buildAppDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(host)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.zrk.archetype"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("脚手架项目")
                .description("创建项目的脚手架")
                .build();
    }
}
