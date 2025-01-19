package se.monty.uppgift.service;

import org.springframework.stereotype.Component;
import se.monty.uppgift.model.AdminDocument;
import java.util.ArrayList;
import java.util.List;

/**
 * Komponent för att hantera administrativa dokument.
 */
@Component
public class AdminService {
    
    /**
     * Hämtar en lista med administrativa dokument
     * @return List<AdminDocument> lista med dokument
     */
    public List<AdminDocument> getAdminDocuments() {
        List<AdminDocument> documents = new ArrayList<>();
        documents.add(new AdminDocument("Administrativ Policy", "Riktlinjer för administrativa rutiner"));
        documents.add(new AdminDocument("Säkerhetsprotokoll", "Säkerhetsrutiner och processer"));
        documents.add(new AdminDocument("Användarhantering", "Guide för hantering av användarkonton"));
        return documents;
    }
} 