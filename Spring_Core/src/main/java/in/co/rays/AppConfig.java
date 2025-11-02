package in.co.rays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation is used to tell spring that this is configure class
@ComponentScan("in.co.rays") // This annotation is used define and scan package
public class AppConfig {
}