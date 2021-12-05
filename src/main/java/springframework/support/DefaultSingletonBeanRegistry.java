package springframework.support;

import springframework.config.SingletonBeanRegistry;

import java.util.HashMap;

/**
 * @Author:吉口吉
 * @Date:Created in 18:18 2021/12/5
 * @Description:
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private HashMap<String,Object> singletonObjects=new HashMap<>();

    @Override
    public Object getSingleton(String beanName){
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }

}
