package ShopAnalytics.Model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by gman0_000 on 03.05.2017.
 */

@Data
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(generator = "ProductGen")
    @SequenceGenerator(name = "ProductGen", sequenceName = "prod_seq", allocationSize = 1)
    private long id;

    @NotNull
    String name;

    public Product() {};

    public Product(String name){
        this.name = name;
    }

}
