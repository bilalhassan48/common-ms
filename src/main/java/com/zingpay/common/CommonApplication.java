package com.zingpay.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Bilal Hassan on 11-Sep-2020
 * @project swagger-ms
 */

@SpringBootApplication
@EnableSwagger2
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
