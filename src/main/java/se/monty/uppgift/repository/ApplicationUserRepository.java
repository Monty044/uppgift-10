package se.monty.uppgift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.monty.uppgift.model.ApplicationUser;

/**
 * Repository interface för hantering av ApplicationUser-entiteter.
 * Ärver från JpaRepository för att få grundläggande CRUD-operationer.
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    /**
     * Hittar en användare baserat på användarnamn
     * @param username användarnamnet att söka efter
     * @return ApplicationUser om den hittas
     */
    ApplicationUser findByUsername(String username);
} 