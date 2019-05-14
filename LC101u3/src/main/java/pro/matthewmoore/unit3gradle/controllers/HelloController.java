package pro.matthewmoore.unit3gradle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value="")
    @ResponseBody
    public String index() {return "Hello Test";}

    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye() {return "Goodbye Everybody!";}
}
