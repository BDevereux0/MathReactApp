package org.example.math.trig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/trig")
public class TrigController {

    @GetMapping()
    public String trigHome(){
        return "trigHome.html";
    }
}
