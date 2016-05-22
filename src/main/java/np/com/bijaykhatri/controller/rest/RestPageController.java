package np.com.bijaykhatri.controller.rest;

import np.com.bijaykhatri.domain.Page;
import np.com.bijaykhatri.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bijay on 5/22/2016.
 */
@RestController
public class RestPageController {

    @Autowired private PageService pageService;

    @RequestMapping(value="/page/all", method= RequestMethod.GET)
    public List<Page> getAllPages(){
        return pageService.findAll();
    }



    @RequestMapping(value="/page/{id}", method= RequestMethod.GET)
    public Page getSinglePage(@PathVariable("id") int id){
        return pageService.findById(id);
    }

    @RequestMapping(value="/page/delete/{id}",method = RequestMethod.DELETE)
    public void deletePage(@PathVariable int id){
         pageService.delete(id);
    }
}

