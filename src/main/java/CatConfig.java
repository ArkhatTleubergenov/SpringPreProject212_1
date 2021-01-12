import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CatConfig {

    @Bean(name="catBean")
    @Scope("prototype")
    public Cat getHelloWorld() {
        Cat cat = new Cat();
        cat.setName("Barsik");
        return cat;
    }
}
