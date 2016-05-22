package np.com.bijaykhatri.service;

import np.com.bijaykhatri.domain.Page;

import java.util.List;

/**
 * Created by Bijay on 5/21/2016.
 */

public interface PageService {
    List<Page> findAll();

    Page save(Page page);

    Page findById(int id);


    void delete(int id);
}
