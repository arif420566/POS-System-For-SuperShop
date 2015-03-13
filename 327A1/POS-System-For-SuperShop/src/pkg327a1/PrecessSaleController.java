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
public class PrecessSaleController
{
    Sale sale;
    
    void makeNewSale(String userClassName)
    {
        this.sale = new Sale(userClassName);
        SaleFactory sf=new SaleFactory();
        sf.database();
    }
    
    void addItem(int id,int quantity)
    {
        sale.addSaleLineItem(id, quantity);
    }
    Sale get_sale()
    {
        return  this.sale;
    }
    ProductSpecification get_ps(int id)
    {
       SaleFactory sf=new SaleFactory();
       return sf.get_ps(id);
    }
}