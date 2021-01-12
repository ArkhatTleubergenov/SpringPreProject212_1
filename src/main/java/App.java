import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        //ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(bean == bean2);

        ApplicationContext catContext = new AnnotationConfigApplicationContext(CatConfig.class);
        Cat catBean = (Cat) catContext.getBean("catBean");
        System.out.println(catBean.getName());

        //ApplicationContext catContext2 = new AnnotationConfigApplicationContext(CatConfig.class);
        Cat catBean2 = (Cat) catContext.getBean("catBean");
        System.out.println(catBean2.getName());

        System.out.println(catBean == catBean2);
        
    }
}