package springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:吉口吉
 * @Date:Created in 14:17 2021/12/5
 * @Description: 容器，用HashMap托管bean
 */

public class BeanFactory {

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {//bean的获取
        return beanMap.get(name);
    }

    public void registerBean(String name, Object bean) {//托管bean
        beanMap.put(name, bean);
    }

}
