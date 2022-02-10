package peaksoft;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("peaksoft")
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;


    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat cat(){
        Cat cat=new Cat("Rahim",19);
        return cat;
    }
}
