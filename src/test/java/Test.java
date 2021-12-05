import pojo.User;
import springframework.BeanFactory;
import springframework.config.BeanDefinition;
import springframework.support.DefaultListableBeanFactory;

public class Test {
    public static void main(String[] args){
        //1.初始化容器
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        //2.注册bean的定义信息（class对象）
        BeanDefinition beanDefinition=new BeanDefinition(User.class);
        factory.registerBeanDefinition("user",beanDefinition);
        //3.获取bean
        User u1=(User)factory.getBean("user");
        u1.userSpeak();
        //4.再次获取bean
        User u2=(User)factory.getBean("user");
        u2.userSpeak();

        System.out.println(u1);
        System.out.println(u2);
        if (u1==u2) System.out.println("两者内存地址相同");
        else System.out.println("两者内存地址不同");
    }
}
