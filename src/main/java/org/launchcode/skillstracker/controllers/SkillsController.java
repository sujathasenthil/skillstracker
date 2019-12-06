package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
@GetMapping
public String check(){
    return "<html>"+
            "<title>SkillsTracker</title>" +
            "<body><b><h2>Skills Tracker</h2>"+
            "<h3>We have a few skills, we would like to learn. Here is the list!</h3></b>"+
            "<h4><ol><li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>"+
            "</ol></h4></body>"+
            "</html>";
}
@GetMapping("form")
public String skillsTrackerForm(){
return "<html><body><form action='form' method='post'>"+
        "<h3><br><br><br><label><b>Name:</b></label>"+
        "<input type ='text' name='name'><br><br>"+
        "<label><b>My favorite language:</b></label><br>"+
        "<select name='lang1'><option='NONE'>---Select---</option>"+
                            "<option value='JAVA'>JAVA</option>"+
                            "<option value='JAVASCRIPT'>Javascript</option>"+
                            "<option value='PYTHON'>Python</option></select><br><br>"+
        "<label><b>My second favorite language:</b></label><br>"+
                            "<select name='lang2'><option='NONE'>---Select---</option>"+
                            "<option value='JAVA'>JAVA</option>"+
                            "<option value='JAVASCRIPT'>Javascript</option>"+
                            "<option value='PYTHON'>Python</option></select><br><br>"+
        "<label><b>My Favorite Language:</b></label><br>"+
                            "<select name='lang3'><option='NONE'>---Select---</option>"+
                            "<option value='JAVA'>JAVA</option>"+
                             "<option value='JAVASCRIPT'>Javascript</option>"+
                             "<option value='PYTHON'>Python</option></select><br><br>"+
                "<input type='submit' value='Submit'>" +
    "</h3></form></body></html>";
}
@PostMapping("form")
    public String showSelectedSkills(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
    return "<html><body><h1><i>"+name+"</i></h1></br>"+
            "<h3><ol><pre><li>"+lang1+"</li></pre></br>"+
            "<pre><li>"+lang2 +"</li></pre></br>"+
            "<pre><li>"+lang3+"</li></pre></ol></h3></body></html>";
}
}
