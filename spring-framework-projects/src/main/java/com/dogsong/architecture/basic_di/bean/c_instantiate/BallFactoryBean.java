package com.dogsong.architecture.basic_di.bean.c_instantiate;

import com.dogsong.architecture.basic_di.bean.c_instantiate.bean.Ball;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/22.
 */
public class BallFactoryBean implements FactoryBean<Ball> {

    @Override
    public Ball getObject() throws Exception {
        return new Ball();
    }

    @Override
    public Class<?> getObjectType() {
        return Ball.class;
    }
}
