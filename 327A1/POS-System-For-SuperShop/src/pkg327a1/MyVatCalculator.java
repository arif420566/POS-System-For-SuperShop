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
public class MyVatCalculator implements IVATCalculator{
    public int getVATAmount(int SaleTotal){
        return (int) Math.round(SaleTotal*0.05);
    }
}
