import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class WorkingApp {
    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml"); // does the same thing

        // Mentor mentor = container.getBean("fullTimeMentor,Mentor.class"); => with 2 parameters, don't need to cast it
        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");

        mentor.createAccount();

        BeanFactory container2 = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");

        mentor1.createAccount();


    }
}
