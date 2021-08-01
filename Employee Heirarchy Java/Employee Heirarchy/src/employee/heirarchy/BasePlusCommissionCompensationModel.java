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

//subclass of Compensation Model
public class BasePlusCommissionCompensationModel extends CompensationModel {
    private double baseSalary;
    
    //Sends grossSales and commissionRate to parent and assigns baseSalary to private variable
    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary){
        //checks for valid inputs
        if(commissionRate < 0 || grossSales < 0 || baseSalary < 0) {
           throw new Error("Invalid Input");
       }
        super.commissionRate = commissionRate;
        super.grossSales = grossSales;
        this.baseSalary = baseSalary;
    }
    
    //override earnings method to add a baseSalary
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
    
    //overrides string method to put into format
    @Override
    public String toString() {
        return String.format("Base Commission Compensation With:\nGross Sales of: " + super.grossSales
        + "\nCommission Rate of: " + super.commissionRate + "\nBase Salary of: " + this.baseSalary + "\nEarnings: " + this.earnings());
    }
}
