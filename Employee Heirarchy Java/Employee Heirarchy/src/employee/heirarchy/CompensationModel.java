/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.heirarchy;

/**
 *
 * @author Mbc2255
 */
public class CompensationModel {
    protected double commissionRate;
    protected double grossSales;
    
    //get earnings used by subclasses
    public double earnings(){
        return this.grossSales * this.commissionRate;
    }
    
    //set commissionRate used by subclasses
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    //get commissionRate used by subclasses
    public double getCommissionRate() {
        return this.commissionRate;
    }
    
    //set grossSales used by subclasses
    public void setGrossSales(double newGrossSales) {
        this.grossSales = newGrossSales;
    }
    
    //get grossSales used by subclasses
    public double getGrossSales() {
        return this.grossSales;
    }
    
}
