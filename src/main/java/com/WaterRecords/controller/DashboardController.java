package com.WaterRecords.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.WaterRecords.entity.WaterRecord;
import com.WaterRecords.service.WaterRecordService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private WaterRecordService waterRecordService;

    @GetMapping
    public String showDashboard(Model model, Principal principal) {
        String username = "";
        if (principal != null) {
            username = principal.getName();
        }

        // Fetch user's water Record history
        List<WaterRecord> waterRecordHistory = waterRecordService.getUserWaterRecordHistory(username);

        model.addAttribute("waterRecordHistory", waterRecordHistory);
        return "dashboard";
    }

    @PostMapping("/recordWater")
    public String recordWaterRecord(@RequestParam("quantity") int quantity, Principal principal) {
        // get the username from connected user

        String username = principal.getName();

        // Save the water Record record
        waterRecordService.recordWaterRecord(username, quantity);

        // Redirect back to the dashboard after recording water Record
        return "redirect:/dashboard";
    }
}