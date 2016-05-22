package np.com.bijaykhatri.controller;

import np.com.bijaykhatri.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bijay on 5/21/2016.
 */
@Controller
public class HomeController {

    @Autowired private PageService pageService;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("pages", pageService.findAll());
        return "index";

    }
}
