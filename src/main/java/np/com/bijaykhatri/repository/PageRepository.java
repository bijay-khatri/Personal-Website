package np.com.bijaykhatri.repository;

import np.com.bijaykhatri.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Bijay on 5/21/2016.
 */
public interface PageRepository extends JpaRepository<Page,Integer>{

    public List<Page> findAll();
}
