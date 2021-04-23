package com.dogsong.architecture.lifecycle.d_prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/23.
 */
@Configuration
public class PrototypeLifecycleConfiguration {

    @Bean(initMethod = "open", destroyMethod = "close")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Pen pen() {
        return new Pen();
    }


}
