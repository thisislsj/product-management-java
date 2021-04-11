/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
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
        ProductManager pm = new ProductManager();
        Product p2 = pm.createProduct(102, "Cofee", BigDecimal.valueOf(2.99), FOUR_STAR);
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FOUR_STAR, LocalDate.now().plusDays(2));
        Product p4 = p2.applyRating(FIVE_STAR);
        System.out.println(p3.equals(p4));

//        p1.setId(10);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
//        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
//        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
//        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStars()+" "+p3.getBestBefore());
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // TODO code application logic here
    }

}
