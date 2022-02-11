package bryan.example.SpringBootPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class GreetingsController {
    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

    @GetMapping("/")
    public String index (Model model){
        String mainGreeting = "Hello user, you visited this page at: " + LocalDate.now().toString() + " at: " + LocalDateTime.now().format(timeFormat).toString();
        model.addAttribute("greeting",mainGreeting);
        return "index";
    }

    @GetMapping("/Spanish")
    public String spanishGreeting (Model model){
        String mainGreeting = "Hola usuario, visitaste esta página el: " + LocalDate.now().toString() + " a las: "+ LocalDateTime.now().format(timeFormat).toString();
        model.addAttribute("greeting",mainGreeting);
        return "spanishGreeting";
    }

    @GetMapping("/French")
    public String frenchGreeting (Model model){
        String mainGreeting = "Bonjour utilisateur, vous avez visité cette page sur : " + LocalDate.now().toString()  + " à: "+ LocalDateTime.now().format(timeFormat).toString();
        model.addAttribute("greeting",mainGreeting);
        return "frenchGreeting";
    }

    @GetMapping("/Italian")
    public String italianGreeting (Model model){
        String mainGreeting = "Ciao utente, hai visitato questa pagina su: " + LocalDate.now().toString() +" in: "+ LocalDateTime.now().format(timeFormat).toString() ;
        model.addAttribute("greeting",mainGreeting);
        return "italianGreeting";
    }
}
