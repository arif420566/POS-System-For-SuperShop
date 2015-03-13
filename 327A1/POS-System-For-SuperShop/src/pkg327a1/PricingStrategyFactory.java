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
public class PricingStrategyFactory {
    
   
   public ISalePricingStrategy getPricingStrategy(String pricingStrategyClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException
   {
       if(pricingStrategyClassName == "Junior"){
           System.out.println(1);
           return new getSalePricingStrategyForJunior();
       }
       else if(pricingStrategyClassName == "Senior")
       {   
           System.out.println(2);
           return new getSalePricingStrategyForSenior();
       }
       else 
       {
           System.out.println(3);
           return new getSalePricingStrategyForCustomer();
       }
              
//String className = System.getProperty(pricingStrategyClassName+".class.name");
       //ISalePricingStrategy strategy = (ISalePricingStrategy) Class.forName(className).newInstance();
       //return strategy;
   }
   
   
}
