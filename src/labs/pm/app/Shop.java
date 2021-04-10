/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Product;

/**
 *{@code Product} describes properties and behaviors of product objects in Product Management System
 * <br>
 * Each product has id, name and price
 * <br>
 * @version 4.0
 * 
 * @author LS
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setId(10);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());
        
        
        // TODO code application logic here
    }
    
}
