import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "MainApp.java") // Specify the package where your Student class resides
public class AppConfig {
    // Define beans if needed
}
