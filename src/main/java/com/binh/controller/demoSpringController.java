package com.binh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class demoSpringController {

    private static Map<String,String> dictionaries = new HashMap<>();

    static {
        dictionaries.put("một","one");
        dictionaries.put("hai","two");
        dictionaries.put("ba","three");
        dictionaries.put("bốn","four");
        dictionaries.put("năm","five");
        dictionaries.put("sáu","six");
        dictionaries.put("bảy","seven");
        dictionaries.put("tám","eight");
        dictionaries.put("chín","nice");
        dictionaries.put("mười","ten");
    }

    @RequestMapping("/home")
    public ModelAndView showHome (Model model){
        ModelAndView mav = new ModelAndView("index");
        String name = "BÌNH ĐÊ ZÉT";
        int age = 25;
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return mav;
    }

    @RequestMapping(value="/searchDictionaries",method = RequestMethod.GET)
    public ModelAndView dictionaries(@RequestParam("eng") String eng,Model model){
        ModelAndView mav = new ModelAndView("index");
        String name = "BÌNH ĐÊ ZÉT";
        int age = 25;
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        String vna = "";
        if (dictionaries.get(eng)!=null){
            vna=dictionaries.get(eng);
        }else vna = vna+"Không tìm thấy trong từ điển";

        model.addAttribute("vna",vna);
        return mav;
    }

    @RequestMapping(value="/page",method = RequestMethod.GET)
    public ModelAndView home (@RequestParam("usd") int usd,Model model){
        String name = "BÌNH ĐÊ ZÉT";
        int age = 25;
        model.addAttribute("name",name);
        model.addAttribute("age",age);

        int vnd = usd*23000;
        model.addAttribute("vnd",vnd);

        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
