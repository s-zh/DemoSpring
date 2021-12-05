import pojo.User;
import springframework.BeanFactory;

public class Test {
    public static void main(String[] args){
        //1.初始化容器BeanFactory
        BeanFactory beanFactory=new BeanFactory();
        //2.托管bean
        beanFactory.registerBean("user",new User());
        //3.获取bean
        User u=(User)beanFactory.getBean("user");
        u.UserSpeak();
    }
}
