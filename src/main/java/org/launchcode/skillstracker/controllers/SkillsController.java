package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String list() {
        return "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2> We have a few skills we would like to earn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                    "<form action = 'form' method = 'post'>" +
                        "<label for = 'name'>Name:</label>" +
                        "<br>" +
                        "<input type='text' name='name' >" +
                        "<br>" +
                        "<label for = 'favLang' >My favorite language</label>" +
                        "<br>" +
                        "select name = 'favLang' id = 'favLang' >" +
                            "<option value = 'Java' >Java</option>" +
                            "<option value = 'Python' >Python</option>" +
                            "<option value = 'JavaScript' >JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for = 'secFav' >My second favorite language</label>" +
                        "<br>" +
                        "<select name = 'secFav' id = 'secFav' >" +
                            "<option value = 'Java' >Java</option>" +
                            "<option value = 'Python' >Python</option>" +
                            "<option value = 'JavaScript' >JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for = 'thirdFav' >My third favorite language</label>" +
                        "<br>" +
                        "<select name = 'thirdFav' id = 'thirdFav' >" +
                            "<option value = 'Java' >Java</option>" +
                            "<option value = 'Python' >Python</option>" +
                            "<option value = 'JavaScript' >JavaScript</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit value = 'Submit'>" +
                    "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping("form")
    public String response(@RequestParam String name, String favLang, String secFav, String thirdFav) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                            "<ol>" +
                                "<li>" + favLang + "</li>" +
                                "<li>" + secFav + "</li>" +
                                "<li>" + thirdFav + "</li>" +
                            "</ol>" +
                        "</body>" +
                    "</html>";
    }

}
