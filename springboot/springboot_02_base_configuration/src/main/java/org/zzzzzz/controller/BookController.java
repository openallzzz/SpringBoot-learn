package org.zzzzzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zzzzzz.MyDatasource;

@RestController
@RequestMapping("/books") // 通用访问前缀
public class BookController {

    @Autowired
    private MyDatasource myDatasource;

    @GetMapping
    public String getById() {
        System.out.println(myDatasource);
        System.out.println("springboot is running ...");
        return "springboot is running ...";
    }

}
