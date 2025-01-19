package se.monty.uppgift.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.monty.uppgift.service.UserService;

@Component
public class InitialDataConfig implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        // Skapa en admin-användare vid uppstart om den inte finns
        userService.registerUser("admin", "admin123", "ADMIN");
    }
} 