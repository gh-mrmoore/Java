package pro.matthewmoore.unit3gradle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="")
public class MainController {
    @RequestMapping(value="")
    @ResponseBody
    public String index() {
        String indexHtml = "<html>" +
                            "<head><title>Java Track, Section 3</title></head>" +
                            "<body>" +
                            "<p><a href='/hello'>Simple Controller Hello</a></p>" +
                            "<p><a href='/hello/goodbye'>Simple Controller Hello/Goodbye</a></p>" +
                            "<p><a href='/methods/querystring?name=Matt'>GET using querystring</a></p>" +
                            "<p><a href='/methods/segment/Jack'>GET by URL Segment</a></p>" +
                            "<p><a href='/methods/post'>POST by Form</a></p>" +
                            "</body>" +
                            "</html>";
        return indexHtml;
    }
}
