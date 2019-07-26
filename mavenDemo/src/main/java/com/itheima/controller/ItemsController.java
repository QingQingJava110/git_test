package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.Itemservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private Itemservice itemservice;
    @RequestMapping("/findDetail")
    public String findDetial(Model model){
        Items items = itemservice.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
