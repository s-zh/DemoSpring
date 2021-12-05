package springframework;

/**
 * @Author:吉口吉
 * @Date:Created in 14:17 2021/12/5
 * @Description: 存放托管对象（bean）
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean){
        this.bean=bean;//在外部注入了一个对象（已被实例化）
    }

    public Object getBean(){
        return bean;
    }

}
