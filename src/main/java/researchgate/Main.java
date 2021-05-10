package researchgate;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("context.xml");
        SessionFactory sessionFactory = context.getBean("sessionFactory", SessionFactory.class);
    }
}
