package pro.matthewmoore.unit3gradle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("studio")
public class StudioController {
    @RequestMapping(value="")
    @ResponseBody
    public String studioIndex() {
        String formHtml = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='language'>" +
                "<option value='en'>English</option>" +
                "<option value='sp'>Spanish</option>" +
                "<option value='fr'>French</option>" +
                "<option value='gr'>German</option>" +
                "<option value='au'>Australian</option>" +
                "<input type='submit' value='Greet Me' />" +
                "</form>";

        return formHtml;
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    @ResponseBody
    public String studioResponse(HttpServletRequest request) {
        String name = request.getParameter("name");
        String lang = request.getParameter("language");

        if (name != null) {
            if (lang.equals("en")) {
                return "Hello " + name + "!";
            } else if (lang.equals("sp")) {
                return "Hola " + name + "!";
            } else if (lang.equals("fr")) {
                return "Bonjour " + name + "!";
            } else if (lang.equals("gr")) {
                return "Guten Tag " + name + "!";
            } else {
                return "G'day " + name + "!" + " --" + lang + "--";
            }
        }
        else {
            return "Hello You!";
        }
    }
}
