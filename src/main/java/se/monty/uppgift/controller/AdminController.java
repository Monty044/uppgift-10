package se.monty.uppgift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.monty.uppgift.service.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @GetMapping
    public String showAdminDashboard(Model model) {
        model.addAttribute("documents", adminService.getAdminDocuments());
        return "admin/dashboard";
    }
} 