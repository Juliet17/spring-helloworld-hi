import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean1.getName());

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);

        if (one == two) {
            System.out.println("Smth wrong");
        } else {
            System.out.println("false");
        }

        HelloWorld hello = applicationContext.getBean(HelloWorld.class);
        HelloWorld bye = applicationContext.getBean(HelloWorld.class);

        if (hello == bye) {
            System.out.println("true");
        } else {
            System.out.println("Smth wrong");
        }
    }
}