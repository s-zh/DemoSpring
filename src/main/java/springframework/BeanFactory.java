package springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:吉口吉
 * @Date:Created in 14:17 2021/12/5
 * @Description: 容器，用HashMap存放BeanDefinition
 */

public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {//bean的获取
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {//存放bean的定义信息
        beanDefinitionMap.put(name, beanDefinition);
    }

}
