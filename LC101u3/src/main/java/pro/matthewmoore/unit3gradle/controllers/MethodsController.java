package pro.matthewmoore.unit3gradle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("methods")
public class MethodsController {
    @RequestMapping(value="querystring")
    @ResponseBody
    public String qsIndex(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "Hello " + name;
    }

    @RequestMapping(value="segment/{name}")
    @ResponseBody
    public String segmentIndex(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping(value="post", method = RequestMethod.GET)
    @ResponseBody
    public String postIndexForm() {
        String htmlForm = "<html>" +
                "<head><title>Form Example</title></head>" +
                "<body>" +
                "<form action='' method='post'>" +
                "<input type='text' name='name' />" +
                "<input type='submit' value='Greet Me!'/>" +
                "</form>" +
                "</body></html>";

        return htmlForm;
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    @ResponseBody
    public String postResponsePage(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "Hello " + name;
    }
}
