package wiwiel.training.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getJoke(){
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
