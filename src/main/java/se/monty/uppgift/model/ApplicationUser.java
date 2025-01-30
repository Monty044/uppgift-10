package se.monty.uppgift.model;

import jakarta.persistence.*;

/**
 * Klass-kommentar: Denna klass representerar en användare i systemet.
 * Den mappar mot en tabell i HSQLDB.
 */
@Entity
public class ApplicationUser {

    /**
     * Unikt ID för varje användare (genereras av databasen).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Användarnamn (behövs för inloggning).
     */
    private String username;

    /**
     * Lösenord (ska lagras krypterat/hashtat).
     */
    private String password;

    /**
     * Roll anger vilka resurser användaren har tillgång till (USER, ADMIN, MANAGER).
     */
    private String role;


    public ApplicationUser() {
    }

    // Praktisk konstruktor
    public ApplicationUser(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}