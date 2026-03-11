package dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean_config_di.xml");

        Car car1 = (Car) context.getBean("car1");
        Car car2 = (Car) context.getBean("car2");
        Car car3 = (Car) context.getBean("car3");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}