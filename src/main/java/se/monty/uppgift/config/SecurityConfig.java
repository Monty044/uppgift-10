package se.monty.uppgift.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import se.monty.uppgift.service.CustomUserDetailsService;

/**
 * Säkerhetskonfiguration för applikationen.
 * Hanterar behörigheter och autentisering.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    /**
     * Konfigurerar säkerhetsregler för olika URL:er i applikationen
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .userDetailsService(userDetailsService)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/register", "/login").permitAll()
                .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN", "MANAGER")
                .requestMatchers("/admin/**").hasAnyRole("ADMIN", "MANAGER")
                .requestMatchers("/manager/**").hasRole("MANAGER")
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/user/dashboard", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            );
        
        return http.build();
    }

    /**
     * Skapar en PasswordEncoder för säker hantering av lösenord
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
} 