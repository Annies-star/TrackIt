package com.example.trainweb.controller;

import com.example.trainweb.entity.Train;
import com.example.trainweb.repository.TrainRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private final TrainRepository trainRepository;

    public HomeController(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("train", new Train());
        return "add-train";
    }

    @PostMapping("/save")
    public String saveTrain(@ModelAttribute Train train) {
        trainRepository.save(train);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(
        @RequestParam String from,
        @RequestParam String to,
        @RequestParam String date,
        @RequestParam String trainClass,
        Model model) {

        model.addAttribute("from", from);
        model.addAttribute("to", to);
        model.addAttribute("date", date);
        model.addAttribute("trainClass", trainClass);

        return "results";
    }
}
