package kr.hs.study.MemoParameter.controller;

import kr.hs.study.MemoParameter.dto.write;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mController {

    @GetMapping("/write")
    public String write(){

        return "write";
    }
    @PostMapping("/result")
    public String result(@ModelAttribute write w , Model model){
        model.addAttribute("title",w.getTitle());
        model.addAttribute("content",w.getContent());
        model.addAttribute("writer",w.getWriter());
        return "result";
    }

}
