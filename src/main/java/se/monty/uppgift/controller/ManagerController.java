package se.monty.uppgift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.monty.uppgift.service.ManagerService;

/**
 * Controller för manager-funktioner
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    /**
     * Visar manager-dashboard
     * @param model Model för att skicka data till vyn
     * @return sökväg till manager-vyn
     */
    @GetMapping
    public String showManagerDashboard(Model model) {
        model.addAttribute("managerInfo", managerService.getManagerInfo());
        return "manager/dashboard";
    }
} 