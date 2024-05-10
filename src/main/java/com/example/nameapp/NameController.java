package com.example.nameapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NameController {

    @GetMapping
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }

}
