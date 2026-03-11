//

package ioc_with_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        // bean creation using BeanFactory
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("BeanConfiguration.xml"));

        Car c = (Car) beanFactory.getBean("car1");
        System.out.println(c);

        Car car2 = (Car) beanFactory.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) beanFactory.getBean("car3");
        System.out.println(car3);

        Car car4 = (Car) beanFactory.getBean("car4");
        System.out.println(car4);

        Car car5 = (Car) beanFactory.getBean("car5");
        System.out.println(car5);


        // bean creation using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfiguration.xml");

        Car car6 = (Car) context.getBean("car1");
        System.out.println(car6);
    }
}