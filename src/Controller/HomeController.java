package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/page1")
    public ModelAndView showPage1(){
        ModelAndView model1 = new ModelAndView();
        model1.setViewName("Page1");

        return model1;
    }

    @RequestMapping("/page2")
    public ModelAndView showPage2(){
        ModelAndView model1 = new ModelAndView();
        model1.setViewName("Page2");

        return model1;
    }

    @RequestMapping("/page3")
    public ModelAndView showPage3(){
        ModelAndView model2 = new ModelAndView();
        model2.setViewName("Page3");

        return model2;
    }

    @ModelAttribute
    public void addingCommonObjects(Model model){
        model.addAttribute("message", "Welcome Message!");
    }


}
