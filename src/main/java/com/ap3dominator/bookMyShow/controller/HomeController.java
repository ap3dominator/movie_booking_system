package com.ap3dominator.bookMyShow.controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

}
