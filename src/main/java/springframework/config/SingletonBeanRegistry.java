package springframework.config;

/**
 * @Author:吉口吉
 * @Date:Created in 18:16 2021/12/5
 * @Description:
 */
public interface SingletonBeanRegistry {//缓存，单例注册表
    public Object getSingleton(String beanName);
}
