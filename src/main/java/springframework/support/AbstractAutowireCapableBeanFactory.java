package springframework.support;

import springframework.config.BeanDefinition;

/**
 * @Author:吉口吉
 * @Date:Created in 18:51 2021/12/5
 * @Description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName,BeanDefinition beanDefinition) {
        Object bean=null;
        try {
            bean=beanDefinition.getBeanClass().newInstance();//通过反射创建
        } catch (InstantiationException | IllegalAccessException e) {
            System.err.println("实例化Bean失败");
        }
        addSingleton(beanName,bean);//加入单例注册表中
        return bean;
    }
}
