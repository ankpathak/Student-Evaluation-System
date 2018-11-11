package practice.spring.revisedSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormControl {

    @RequestMapping("/form")
    public ModelAndView getDetails(){

        ModelAndView model = new ModelAndView("form-demo");
        return model;
    }

    @RequestMapping("/list")
    public ModelAndView getList()
    {
        List<String> list = new ArrayList<String>();

        list.add("Ruchi");
        list.add("Pareek");

        ModelAndView model = new ModelAndView("list");

        model.addObject("list",list);
        model.addObject("name","Gaurav");
        return model;
    }

    @ModelAttribute
    public void function(Model model){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        model.addAttribute("arrayList",arrayList);
    }
}
