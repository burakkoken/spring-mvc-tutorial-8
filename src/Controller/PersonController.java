package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 19.1.2017.
 */
@Controller
public class PersonController {

    @RequestMapping("/person")
    public ModelAndView showPersonPage(){
        ModelAndView modelAndView = new ModelAndView("PersonPage");

        return modelAndView;
    }
}
