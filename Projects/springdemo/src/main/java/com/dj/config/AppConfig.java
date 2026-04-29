package com.dj.config;

import org.springframework.context.annotation.ComponentScan;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;

// import com.dj.Alien;
// import com.dj.Computer;
// import com.dj.Desktop;
// import com.dj.Laptop;

@Configuration
//by using Compoonet scan we are saying to spring to check 
//for the components and see if there is @Componet on top of them 
@ComponentScan("com.dj") //mention you base pacakge. 
public class AppConfig {
    
    //By using the @component -> setereo type annotation
    //we don't need to use any configuration. 


    // @Bean (name = {"com2","desktop1","djdesktop",})// bean name is by default the method name
    // @Bean
    // // @Scope("prototype")
    // public Desktop desktop(){
    //     return new Desktop();
    // }

    // @Bean
    // //when we have two beans of the same type com
    // //it will give error so we need to use @Qualifier
    // //@Autowire here is a not madatory. 
    // public Alien alien(@Qualifier("desktop") @Autowired Computer com){
    //     Alien obj = new Alien();
    //     obj.setAge(25);
    //     obj.setCom(com);
    //     return obj;
    // }

    // @Bean
    // @Primary // instead of the confusionn 
    // // it will go for the laptop here. 
    // public Laptop laptop(){
    //     return new Laptop();
    // }

}
