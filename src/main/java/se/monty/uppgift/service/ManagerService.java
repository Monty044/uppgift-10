package se.monty.uppgift.service;

import org.springframework.stereotype.Component;
import se.monty.uppgift.model.ManagerInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Komponent för att hantera manager-specifik information.
 */
@Component
public class ManagerService {
    

    public List<ManagerInfo> getManagerInfo() {
        List<ManagerInfo> infoList = new ArrayList<>();
        infoList.add(new ManagerInfo("Projektöversikt", "Status för pågående projekt"));
        infoList.add(new ManagerInfo("Resursallokering", "Fördelning av teamresurser"));
        infoList.add(new ManagerInfo("Budgetrapport", "Aktuell budgetstatus"));
        return infoList;
    }
} 