package se.monty.uppgift.model;

/**
 * Klass som representerar information specifik för managers.
 */
public class ManagerInfo {
    private String title;
    private String infoText;

    public ManagerInfo(String title, String infoText) {
        this.title = title;
        this.infoText = infoText;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }
} 