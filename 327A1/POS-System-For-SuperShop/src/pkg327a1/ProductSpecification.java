/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

/**
 *
 * @author Bandhan
 */
public class ProductSpecification {
    int id, price;
    String name = new String();
    String description = new String(); 
    void set_id (int id)
    {
        this.id=id;
    }
    void set_price (int price)
    {
        this.price=price;
    }
    void set_description (String description)
    {
        this.description=description;
    }
    void set_name (String name)
    {
        this.name=name;
       
    }
    
    int get_id()
    {
        return id;
    }
    int get_price()
    {
        return price;
       
    }
    String get_description()
    {
        return description;
    }
    String get_name()
    {
        return name;
    }
    
    
}
