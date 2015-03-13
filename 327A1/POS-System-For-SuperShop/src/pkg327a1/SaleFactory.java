/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

import java.util.LinkedList;

/**
 *
 * @author Bandhan
 */
public class SaleFactory {
    
    static SaleFactory instance;
    IVATCalculator vatCalculator;
    IVATCalculator mvc= new MyVatCalculator(); //not used in diagram.selects a VATCalculator.
    
    
    static LinkedList<ProductSpecification> psList=new LinkedList<>();
    
    void database()
    {
       ProductSpecification ps1=new ProductSpecification();
       ps1.set_id(1);
       ps1.set_name("A");
       ps1.set_price(100);
       ps1.set_description("");
       psList.add(ps1);
       
       ProductSpecification ps2=new ProductSpecification();
       ps2.set_id(2);
       ps2.set_name("B");
       ps2.set_price(200);
       ps2.set_description("");
       psList.add(ps2);
       
       ProductSpecification ps3=new ProductSpecification();
       ps3.set_id(3);
       ps3.set_name("C");
       ps3.set_price(300);
       ps3.set_description("");
       psList.add(ps3);
       
       ProductSpecification ps4=new ProductSpecification();
       ps4.set_id(4);
       ps4.set_name("D");
       ps4.set_price(400);
       ps4.set_description("");
       psList.add(ps4);
       
       ProductSpecification ps5=new ProductSpecification();
       ps5.set_id(5);
       ps5.set_name("E");
       ps5.set_price(500);
       ps5.set_description("");
       psList.add(ps5);
       
       ProductSpecification ps6=new ProductSpecification();
       ps6.set_id(6);
       ps6.set_name("F");
       ps6.set_price(600);
       ps6.set_description("");
       psList.add(ps6);
       
       ProductSpecification ps7=new ProductSpecification();
       ps7.set_id(7);
       ps7.set_name("G");
       ps7.set_price(700);
       ps7.set_description("");
       psList.add(ps7);
       
       ProductSpecification ps8=new ProductSpecification();
       ps8.set_id(8);
       ps8.set_name("H");
       ps8.set_price(800);
       ps8.set_description("");
       psList.add(ps8);
       
       ProductSpecification ps9=new ProductSpecification();
       ps9.set_id(9);
       ps9.set_name("I");
       ps9.set_price(900);
       ps9.set_description("");
       psList.add(ps9);
       
       ProductSpecification ps10=new ProductSpecification();
       ps10.set_id(10);
       ps10.set_name("J");
       ps10.set_price(1000);
       ps10.set_description("");
       psList.add(ps10);
    }
    ProductSpecification get_ps(int id)
    {
        ProductSpecification ps= new ProductSpecification(); 
        for(int i=0;i<psList.size();i++)
        {
            if( psList.get(i).get_id()==id) 
                ps = psList.get(i);
        } 
        return ps; 
    }
    
    public static synchronized SaleFactory getInstance(){
        if (instance==null)
            instance=new SaleFactory();

        return instance;
    }
    
    public IVATCalculator getVatCalculator() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        if(vatCalculator==null)
        {
            String className = mvc.getClass().getName();
            vatCalculator= (IVATCalculator) Class.forName(className).newInstance();
        }
        return vatCalculator;
    }
 }

