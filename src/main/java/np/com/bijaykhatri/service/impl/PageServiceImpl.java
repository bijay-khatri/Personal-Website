package np.com.bijaykhatri.service.impl;

import np.com.bijaykhatri.domain.Page;
import np.com.bijaykhatri.repository.PageRepository;
import np.com.bijaykhatri.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bijay on 5/21/2016.
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired private PageRepository pageRepository;
    @Override
    public List<Page> findAll() {
        return pageRepository.findAllByOrderByPageOrderDesc();
    }

    @Override
    public Page save(Page page) {
        return pageRepository.save(page);
    }

    @Override
    public Page findById(int id) {
        return pageRepository.findById(id);
    }

    @Override
    public void delete(int id) {
         pageRepository.delete(id);
    }


}
