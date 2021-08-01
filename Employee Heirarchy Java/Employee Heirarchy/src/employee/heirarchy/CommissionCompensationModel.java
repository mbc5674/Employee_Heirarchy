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

//subclass of CompensationModel
public class CommissionCompensationModel extends CompensationModel {
    
   //Constructor sends arguments to parent class for asignment
   public CommissionCompensationModel(double grossSales, double commissionRate) {
       //determines if an input is valid
       if(commissionRate < 0 || grossSales < 0) {
           throw new Error("Invalid Input");
       }
       super.commissionRate = commissionRate;
       super.grossSales = grossSales;
   }
   
   //overrides the string method to use a special format
   @Override
    public String toString() {
        return String.format("Commission Compensation With:\nGross Sales of: " + super.grossSales
        + "\nCommission Rate of: " + super.commissionRate + "\nEarnings: " + super.earnings());
    }
}
