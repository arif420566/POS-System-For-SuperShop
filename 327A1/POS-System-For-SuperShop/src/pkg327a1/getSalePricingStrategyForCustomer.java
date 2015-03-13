/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

/**
 *
 * @author UnNaMeD
 */
public class getSalePricingStrategyForCustomer implements ISalePricingStrategy{
    
    // For default
    private float discountPercentage = 0;
    
    
    
    public void set_discountPercentage(float discountPercentage)
    {
        this.discountPercentage = discountPercentage;
    }
    
    @Override
    public float GetTotal(Sale sale) {
        float calculation = sale.getPreDiscountTotal() * (this.discountPercentage / 100);
        return calculation;
    }
    
}
