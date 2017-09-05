package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by hyun ji Ra on 2017-09-04.
 */
@Controller
public class MainController {


    @RequestMapping("/aaa")
    public String Index(Model model) throws Exception {
        model.addAttribute("test","hihi h yunji!");
        System.out.println("view");
        return "view";

    }
    @RequestMapping("/modelandview/mv")
    public ModelAndView Index2(Model model) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("id",30);
        mv.setViewName("modelandview/mv");
        return mv;

    }

//
//    @RequestMapping("/main.do")
//
//    public String Main(Model model) throws Exception {
//
//        System.out.println("main");
//
//        return "home";
//
//    }

}