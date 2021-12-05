import pojo.User;
import springframework.BeanDefinition;
import springframework.BeanFactory;

public class Test {
    public static void main(String[] args){
        //1.初始化BeanFactory
        BeanFactory beanFactory=new BeanFactory();
        //2.注入bean
        BeanDefinition beanDefinition=new BeanDefinition(new User());
        beanFactory.registerBeanDefinition("user",beanDefinition);
        //3.获取bean
        User u=(User)beanFactory.getBean("user");
        u.UserSpeak();
    }
}
