package io.acari;

import javax.ejb.Startup;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class StartupServiceProvider implements Extension {
    private final Set<Bean<?>> startupBeans = new LinkedHashSet<>();

    <T> void onBeanProcess(@Observes ProcessBean<T> processBeanEvent, BeanManager beanManager){
        if(processBeanEvent.getAnnotated().isAnnotationPresent(Startup.class)){
            startupBeans.add(processBeanEvent.getBean());
        }
    }

    void onApplicationDeploymentValidation(@Observes AfterDeploymentValidation afterDeploymentValidationEvent,
                                           BeanManager beanManager){
        startupBeans.forEach(bean -> {
            CreationalContext<?> creationalContext = beanManager.createCreationalContext(bean);
            Object startupBeanReference = beanManager.getReference(bean,
                    bean.getBeanClass(), creationalContext);
            System.err.println(startupBeanReference.toString() + " has been jump started!");
        });
    }
}
