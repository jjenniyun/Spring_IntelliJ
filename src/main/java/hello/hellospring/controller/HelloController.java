package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","spring!!");
        // return hello -> viewResolver가 hello(viewname).html를 찾아서 thymeleaf템플릿 엔진 처리 해줌
        return "hello";
    }
}
