package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloWorldController2 {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloWord () {
        return "Hello World!";
    }

    @GetMapping("ciao/{provincia}")
    public User ciao(
            @PathVariable String provincia,
            @RequestParam String nome
    ) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User(nome, provincia , saluto );
    }
}