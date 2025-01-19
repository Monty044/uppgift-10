package se.monty.uppgift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import se.monty.uppgift.model.ApplicationUser;
import se.monty.uppgift.repository.ApplicationUserRepository;

/**
 * Service för hantering av användare
 */
@Service
public class UserService {

    @Autowired
    private ApplicationUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * Registrerar en ny användare
     * @param username användarnamn
     * @param password lösenord
     * @param role användarroll
     * @return den skapade användaren
     */
    public ApplicationUser registerUser(String username, String password, String role) {
        ApplicationUser user = new ApplicationUser();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(role);
        return userRepository.save(user);
    }
} 