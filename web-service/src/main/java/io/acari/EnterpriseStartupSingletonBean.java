package io.acari;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Startup;
import javax.inject.Singleton;

@Startup
@Singleton
public class EnterpriseStartupSingletonBean {
    @PostConstruct
    void initialize(){
        System.err.println("Enterprise Singleton Bean Doing Startup Work!");
    }

    @PreDestroy
    void shutdown(){
        System.err.println("Enterprise Singleton Bean Doing Cleanup Work before shutdown!");
    }

    @Override
    public String toString() {
        return "EnterpriseStartupSingletonBean";
    }
}
