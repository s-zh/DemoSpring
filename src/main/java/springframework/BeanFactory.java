package springframework;


/**
 * @Author:吉口吉
 * @Date:Created in 14:17 2021/12/5
 * @Description:
 */

public interface BeanFactory {//容器
    public Object getBean(String name);
}
