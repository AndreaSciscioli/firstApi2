package co.develhope.firstapi2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/factorial")
public class FactorialController {
    @GetMapping("/{n}")

    public Integer factorial(@PathVariable int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        return fact;
    }




}
