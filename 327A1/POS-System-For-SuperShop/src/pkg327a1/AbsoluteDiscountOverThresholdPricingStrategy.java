/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UnNaMeD
 */
public class AbsoluteDiscountOverThresholdPricingStrategy implements ISalePricingStrategy{

    
    private float discount;
    private float threshold = 400;
    private String UserClassName;
    
    public AbsoluteDiscountOverThresholdPricingStrategy(String userClassName)
    {
        this.UserClassName = userClassName;
    }
    
    public float getDiscount(Sale s) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        PricingStrategyFactory strategyFactory = new PricingStrategyFactory();
        
        ISalePricingStrategy strategy = (ISalePricingStrategy)strategyFactory.getPricingStrategy(this.UserClassName);
        
        return strategy.GetTotal(s);
    }
    
    public void setThreshold(float threshold)
    {
        this.threshold = threshold;
    }
    
    public float getThreshold()
    {
        return this.threshold;
    }
    
    @Override
    public float GetTotal(Sale s) {
        
        float pdt = s.getPreDiscountTotal();
        //System.out.println(pdt);
        if(pdt < threshold)
        {
            return pdt;
        }
        else
        {
            try {
                //System.out.println(this.getDiscount(s) + " " + this.UserClassName + " " + s.userClassName);
                return pdt - this.getDiscount(s);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AbsoluteDiscountOverThresholdPricingStrategy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(AbsoluteDiscountOverThresholdPricingStrategy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(AbsoluteDiscountOverThresholdPricingStrategy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

}
