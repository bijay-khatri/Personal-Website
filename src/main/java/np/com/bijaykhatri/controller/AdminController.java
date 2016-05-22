package np.com.bijaykhatri.controller;

import np.com.bijaykhatri.domain.Page;
import np.com.bijaykhatri.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

/**
 * Created by Bijay on 5/21/2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired private PageService pageService;

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("pages", pageService.findAll());
        return "admin/list_page";
    }

    @RequestMapping(value="/add",method= RequestMethod.GET)
    public String addPageForm(Model model){
        model.addAttribute("page", new Page());
        return "admin/add_page";
    }

    @RequestMapping(value="/add",method= RequestMethod.POST)
    public String savePage(@ModelAttribute Page page, RedirectAttributes ra){
        page.setCreatedDate(new Date());
        pageService.save(page);
        ra.addFlashAttribute("message","Information Added Successfully");
        return "redirect:/admin";
    }

    @RequestMapping(value="/add/{id}",method= RequestMethod.GET)
    public String editPageForm(@PathVariable int id, Model model){
       model.addAttribute("page",pageService.findById(id));
       return "admin/add_page";
    }

    @RequestMapping(value="/add/{id}",method= RequestMethod.POST)
    public String updatePage(@PathVariable Integer id,@ModelAttribute Page page, RedirectAttributes ra){
        page.setCreatedDate(new Date());
        pageService.save(page);
        ra.addFlashAttribute("message","Information Added Successfully");
        return "redirect:/admin";
    }
}
