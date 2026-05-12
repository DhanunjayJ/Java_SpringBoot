package com.dj.spring_security_demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    public AuthenticationProvider authProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        return provider;
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){

        //using a builder pattern 
        http
        .csrf(customizer -> customizer.disable())
        .authorizeHttpRequests(request -> request.anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        .sessionManagement(session -> 
            session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        
        return http.build();
    }

    //creating new user name and passwrod
    // @Bean
    // public UserDetailsService userDetailsService  (){
    //     UserDetails user = User
    //                         .withDefaultPasswordEncoder()
    //                         .username("dj")
    //                         .password("123")
    //                         .roles("USER")
    //                         .build();

    //     UserDetails user1 = User
    //                         .withDefaultPasswordEncoder()
    //                         .username("admin")
    //                         .password("123")
    //                         .roles("ADMIN")
    //                         .build();

    //     return new InMemoryUserDetailsManager(user,user1);
    // }

}
