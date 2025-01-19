package se.monty.uppgift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import se.monty.uppgift.model.ApplicationUser;
import se.monty.uppgift.repository.ApplicationUserRepository;

import java.util.Collections;

/**
 * Service för att ladda användardetaljer för Spring Security
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private ApplicationUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Användare hittades inte: " + username);
        }
        return new User(user.getUsername(), 
                       user.getPassword(),
                       Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + user.getRole())));
    }
} 