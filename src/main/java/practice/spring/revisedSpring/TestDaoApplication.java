package practice.spring.revisedSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestDaoApplication {

    @RequestMapping("/hello/{lastName}")
    public @ResponseBody
    String Hello(@PathVariable String lastName, @RequestParam String name) {

        return "Hello Frands Chai Pilo " + lastName + " " + name;


    }
    @RequestMapping("/get-view")
    public ModelAndView getView()
    {
        ModelAndView model = new ModelAndView("view");
        model.addObject("greeting","Hello Gandhi Ji");
        return model;

    }

    @ModelAttribute
    public void getModel(Model model)
    {
        model.addAttribute("Name","gandhi JI hain naam");
    }
}
