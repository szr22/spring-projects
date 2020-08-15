import com.prettyye.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String args[]) {
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNam());

//        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
//
//        System.out.println(service2);
    }
}
