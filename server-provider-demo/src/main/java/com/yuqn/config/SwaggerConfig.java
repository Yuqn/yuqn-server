package com.yuqn.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.net.InetAddress;

@Configuration
@Slf4j
public class SwaggerConfig {

    @Value("${server.port}")
    private  String port = "0000";

    /**
     * @author: yuqn
     * @Date: 2023/4/15 0:12
     * @description:
     * 生成 swagger 文档
     * @param: null
     * @return: null
     */
    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.OAS_30);
        docket.apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yuqn.controller"))
                .build();

        log.info("|====================生成swagger文档成功=====================|");
        log.info("|----- http://"+ getAddressAndPort() +"/swagger-ui/index.html ----|");
        log.info("|--------------------点击上面连接跳转浏览器--------------------|");
        log.info("|==========================================================|");
        return docket;
    }

    /**
     * @author: yuqn
     * @Date: 2023/4/15 0:11
     * @description:
     * 获取 swagger 其他信息信息
     * @param: null
     * @return: null
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot-Swagger集成")
                .description("springboot | swagger")
                // 作者信息
                .contact(new Contact("yuqn", "http://www.yuqn.xyz", "2572655497@qq.com"))
                .version("v-1.0.0")
                .build();
    }
    /**
     * @author: yuqn
     * @Date: 2023/4/15 0:12
     * @description:
     * 获取项目ip和端口
     * @param: null
     * @return: string
     */
    private String getAddressAndPort(){
        String msg="";
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            msg = localHost.getHostAddress() + ":" + port;
        }catch (Exception e){
            log.error("获取ip地址出错！错入信息：" + e);
        }
        return msg;
    }
}
