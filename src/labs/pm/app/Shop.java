/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;
import static labs.pm.data.Rating.*;

/**
 * {@code Product} describes properties and behaviors of product objects in
 * Product Management System
 * <br>
 * Each product has id, name and price
 * <br>
 *
 * @version 4.0
 *
 * @author LS
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Product(102, "Cofee", BigDecimal.valueOf(2.99), FOUR_STAR);;
        Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), FOUR_STAR);
        Product p4 = p2.applyRating(FIVE_STAR);

//        p1.setId(10);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRating().getStars());

        // TODO code application logic here
    }

}
