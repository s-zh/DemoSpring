package springframework.config;

/**
 * @Author:吉口吉
 * @Date:Created in 18:10 2021/12/5
 * @Description:
 */
public class BeanDefinition {//类信息，封装Class
    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass=beanClass;
    }
    public Class getBeanClass(){
        return this.beanClass;
    }
    public void setBeanClass(Class beanClass){
        this.beanClass=beanClass;
    }
}
