package com.cps.www.controller;

import com.cps.www.entity.Poetry;
import com.cps.www.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class PoetryController {
    @Autowired
    private PoetryService poetryService;

    @RequestMapping("/search")
    public ModelAndView search(String type, String key, ModelAndView modelAndView) {
        System.out.println(type);
        System.out.println(key);

        List<Poetry> lists = poetryService.selectByTitle(type, key);

        modelAndView.setViewName("poetries");
        modelAndView.addObject("lists", lists);

        return modelAndView;
    }
}
