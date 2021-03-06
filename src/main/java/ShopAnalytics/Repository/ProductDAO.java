package ShopAnalytics.Repository;

import ShopAnalytics.Model.Product;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by gman0_000 on 03.05.2017.
 */

@Transactional
public interface ProductDAO extends CrudRepository<Product, Long> {


    
}
