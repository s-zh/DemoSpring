package springframework.support;

import springframework.BeanFactory;
import springframework.config.BeanDefinition;

/**
 * @Author:吉口吉
 * @Date:Created in 18:44 2021/12/5
 * @Description:
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name){
        Object bean =getSingleton(name);
        if(bean!=null) return bean;
        BeanDefinition beanDefinition=getBeanDefinition(name);//使用抽象方法
        return createBean(name,beanDefinition);//使用抽象方法
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);
}
