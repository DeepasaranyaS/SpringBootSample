package com.deepa.springbootsample.hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {
    @GetMapping("/hello")
public String getHello() {
        //screen transition to hello.html
        return "hello";
    }
    @PostMapping("/hello")
    public String postRequest(@RequestParam ("text1") String str, Model model)//text1 is the name attribute
    {
//Register the string received from the screen to Model
model.addAttribute("Sample",str);
//Screen transition to response.html
        return "hello/response"; //it is the file path.
    }
}
