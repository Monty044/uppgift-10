package se.monty.uppgift.service;

import org.springframework.stereotype.Component;
import se.monty.uppgift.model.AdminDocument;
import java.util.ArrayList;
import java.util.List;


@Component
public class AdminService {
    

    public List<AdminDocument> getAdminDocuments() {
        List<AdminDocument> documents = new ArrayList<>();
        documents.add(new AdminDocument("Administrativ Policy", "policy glöm inte"));
        documents.add(new AdminDocument("Säkerhetsprotokoll", "Protectionn"));
        documents.add(new AdminDocument("Användarhantering", "kolla"));
        return documents;
    }
} 