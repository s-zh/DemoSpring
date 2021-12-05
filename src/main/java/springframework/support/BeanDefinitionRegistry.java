package springframework.support;

import springframework.config.BeanDefinition;

/**
 * @Author:吉口吉
 * @Date:Created in 18:14 2021/12/5
 * @Description:
 */
public interface BeanDefinitionRegistry {//类信息注册表
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
