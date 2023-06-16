package dev.bitan.SpringBootThymeleafForm.user.controller;

import dev.bitan.SpringBootThymeleafForm.user.repository.UserRepository;
import dev.bitan.SpringBootThymeleafForm.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registerForm";
    }


    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        user.setRole("ROLE_USER");
        userRepository.save(user);
        System.out.println(user);
        return "register_success";
    }


}
