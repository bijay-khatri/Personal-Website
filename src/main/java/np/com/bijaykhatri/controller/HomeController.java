package np.com.bijaykhatri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bijay on 5/21/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value="name", required = false, defaultValue = "Bijay") String name, Model model){
        model.addAttribute("name","Bijay Khatri");
        return "index";

    }
}
