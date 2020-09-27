package ufm.cis.jayani;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        ufm.cis.jayani.di.House house = (ufm.cis.jayani.di.House) appContext.getBean("house");
        house.doSomething();
    }

}