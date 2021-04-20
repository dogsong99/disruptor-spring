package com.dogsong.architecture.basic_di.c_value_spel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/19.
 */
@Configuration
@ComponentScan("com.dogsong.architecture.basic_di.c_value_spel.bean")
@PropertySource("classpath:basic_di/red.properties")
public class InjectValueConfiguration {

}
