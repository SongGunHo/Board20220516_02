package com.its.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String idex(){
        return "idex";
    }
    @GetMapping("/save")
    public String aave(){
        System.out.println("HomeController.save");
        // 컨틀롤러에서 String 리턴뒤에 .jsp가 붙는 다고 보시면 됩니다
        return "save";
    }
}
