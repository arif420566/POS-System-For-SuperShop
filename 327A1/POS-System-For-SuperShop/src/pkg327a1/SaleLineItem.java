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
public class SaleLineItem
{
    ProductSpecification ps;
    int quantity;
    
    void SaleLineItem( int id,int quantity)
    {
        SaleFactory sf= SaleFactory.getInstance();
        this.ps=sf.get_ps(id);
        this.quantity=quantity;
    }
    ProductSpecification get_ps()
    {
        return ps;
    }
    int get_quantity()
    {
        return quantity;
    }
    int get_subTotal()
    {
        return quantity*ps.get_price();
    }
            
    
}
