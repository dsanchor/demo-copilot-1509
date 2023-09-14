package com.example.demo1409.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Received request to say hello");
        String response = "Hello, world!";
        System.out.println("Sending response: " + response);
        return response;
    }

    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        System.out.println("Received request to reverse text: " + text);
        StringBuilder sb = new StringBuilder(text);
        String reversedText = sb.reverse().toString();
        System.out.println("Sending response: " + reversedText);
        return reversedText;
    }

    // operation to remove all vowels from a string
    @GetMapping("/disemvowel")
    public String disemvowelText(@RequestParam String text) {
        System.out.println("Received request to disemvowel text: " + text);
        String disemvoweledText = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Sending response: " + disemvoweledText);
        return disemvoweledText;
    }

}
