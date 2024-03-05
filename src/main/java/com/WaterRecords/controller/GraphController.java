package com.WaterRecords.controller;

import java.security.Principal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.WaterRecords.entity.WaterRecord;
import com.WaterRecords.service.WaterRecordService;

@Controller
public class GraphController {

    @Autowired
    private WaterRecordService waterRecordService;

    @GetMapping("/graph")
    public String showGraph(Model model, Principal principal) {
        List<WaterRecord> waterRecords = waterRecordService.getUserWaterRecordHistory(principal.getName());

        Map<LocalDate, Integer> dailyTotal = new TreeMap<>();
        for (WaterRecord record : waterRecords) {
            LocalDate date = record.getDate().toLocalDate();
            dailyTotal.put(date, dailyTotal.getOrDefault(date, 0) + record.getAmount());
        }

        List<String> dates = new ArrayList<>();
        List<Integer> amounts = new ArrayList<>();

        for (Map.Entry<LocalDate, Integer> entry : dailyTotal.entrySet()) {
            dates.add(entry.getKey().format(DateTimeFormatter.ISO_DATE));
            amounts.add(entry.getValue());
        }

        model.addAttribute("dates", dates);
        model.addAttribute("amounts", amounts);

        return "graph";
    }
}