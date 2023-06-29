package kr.hs.study.MemoParameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String memo(){

        return "memo";
    }

}
