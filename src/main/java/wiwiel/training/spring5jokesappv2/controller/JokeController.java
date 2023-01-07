package wiwiel.training.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wiwiel.training.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    String getJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
