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
public class PercentDiscountPricingStrategy implements ISalePricingStrategy{

    private float percentage;
    
    public void setPercentage(float percentage)
    {
        this.percentage = percentage;
    }
    
    public float getPercentage()
    {
        return this.percentage;
    }

    @Override
    public float GetTotal(Sale s) {
    
    return s.getPreDiscountTotal() * ( getPercentage() / 100);
    }

}
