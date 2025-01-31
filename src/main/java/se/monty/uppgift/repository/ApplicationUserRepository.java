package se.monty.uppgift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.monty.uppgift.model.ApplicationUser;


public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
} 