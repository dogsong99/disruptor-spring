package com.dogsong.architecture.basic_di.h_aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean bbb() {
        return new AwaredTestBean();
    }

}
