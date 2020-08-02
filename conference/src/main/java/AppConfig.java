import com.prettyye.repository.HibernateSpeakerRepositoryImpl;
import com.prettyye.repository.SpeakerRepository;
import com.prettyye.service.SpeakerService;
import com.prettyye.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
