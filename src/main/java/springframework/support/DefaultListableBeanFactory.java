package springframework.support;

import springframework.config.BeanDefinition;

import java.util.HashMap;

/**
 * @Author:吉口吉
 * @Date:Created in 18:58 2021/12/5
 * @Description:
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private HashMap<String,BeanDefinition> beanDefinitionHashMap=new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition=beanDefinitionHashMap.get(beanName);
        if(beanDefinition==null) System.err.println("beanName为"+beanName+"的bean没有被定义");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionHashMap.put(beanName,beanDefinition);
    }
}
