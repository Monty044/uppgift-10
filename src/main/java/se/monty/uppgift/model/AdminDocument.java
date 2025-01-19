package se.monty.uppgift.model;

/**
 * Klass som representerar administrativa dokument i systemet.
 */
public class AdminDocument {
    private String title;
    private String description;

    public AdminDocument(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
} 