package com.spring.annotation.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonDemo")
//@Scope("singleton")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}
