package org.zzzzzz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books") // 通用访问前缀
public class BookController {

    @GetMapping
    public String getById() {
        System.out.println("springboot is running ...4");
        return "springboot is running ...4";
    }

}
