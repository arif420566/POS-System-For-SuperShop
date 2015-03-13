/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg327a1;

/**
 *
 * @author lenovo
 */
public class BDVATAdapter implements IVATCalculator{
    BDVATCalculator bvc=new BDVATCalculator();
 
    @Override
    public int getVATAmount(int SaleTotal) {
        return (int) Math.floor (bvc.calculateVATAmount(SaleTotal));  
    }
}
