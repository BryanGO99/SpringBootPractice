package bryan.example.SpringBootPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class GreetingsController {

    @GetMapping("/")
    public String index (Model model){
        String mainGreeting = "Hello user, you visited this page at: " + LocalDate.now().toString();
        model.addAttribute("greeting",mainGreeting);
        return "index";
    }

    @GetMapping("/Spanish")
    public String spanishGreeting (Model model){
        String mainGreeting = "Hola usuario, visitaste esta página el: " + LocalDate.now().toString();
        model.addAttribute("greeting",mainGreeting);
        return "spanishGreeting";
    }
}
