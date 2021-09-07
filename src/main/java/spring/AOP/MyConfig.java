package spring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan ("spring.AOP")
@EnableAspectJAutoProxy // позволяет нам за кулисами использовать Spring AOP Proxy
public class MyConfig {

}
