/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bandhan
 */
public class Sale
{
    IVATCalculator ivac;
    public String userClassName;
    static LinkedList<SaleLineItem> sliList=new LinkedList<>();
     int total = 0;
    AbsoluteDiscountOverThresholdPricingStrategy isps;
    public Sale(String userClassName)
    {
        this.userClassName = userClassName;
        isps = new AbsoluteDiscountOverThresholdPricingStrategy(this.userClassName);
    }
    
    public float getTotalDiscount()
    {
        try {
            return isps.getDiscount(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    return 0;
    }
    
    
    void addSaleLineItem (int id,int quantity)
    {
        SaleLineItem sli = new SaleLineItem();
        sli.SaleLineItem(id,quantity);
        sliList.add(sli);
    }
    
    
    public float getPreDiscountTotal()
    {
        return total;
    }
    
    SaleLineItem get_SaleLineItem ()
    {
        return sliList.getLast();
        
    }
    
    int get_total()
    {
        total=0;
        for(int i=0;i<sliList.size();i++)
        {
            total+=sliList.get(i).get_subTotal();
        }
        return (int) isps.GetTotal(this);
    }
    void reset_sli()
    {
        while (!sliList.isEmpty())
        {
            sliList.removeFirst();
        }
    }
    
    int getGrandTotal() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (this.get_total()+this.getVatAmount());
    }
    int getVatAmount() throws ClassNotFoundException, InstantiationException, IllegalAccessException{   
        ivac=SaleFactory.getInstance().getVatCalculator();
        return ivac.getVATAmount(this.get_total());
    }
}
