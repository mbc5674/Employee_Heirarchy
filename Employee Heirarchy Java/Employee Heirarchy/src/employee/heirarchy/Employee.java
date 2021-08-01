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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;
    Pattern pattern = Pattern.compile("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]");
    
    //uses a CompensationModel object to determine attributes like earnings and social security numbers
    public Employee(String firstName, String lastName, String socialSecurityModel, CompensationModel compensationModel){
        this.firstName = firstName;
        this.lastName = lastName;
        Matcher matcher = pattern.matcher(socialSecurityModel);
        //uses regex and .length() to check for a valid social security number
        if(!matcher.find() || socialSecurityModel.length() != 11) {
            throw new Error("Invalid input");
        }
        this.socialSecurityNumber = socialSecurityModel;
        this.compensationModel = compensationModel;
    }
    
    //Used to change the type of CompensationModel
    public void setCompensation(CompensationModel newCompensationModel) {
        this.compensationModel = newCompensationModel;
    }
    
    //returns earnings of CompensationModel object
    public double earnings() {
        return this.compensationModel.earnings();
    }
    
    //returns first name
    public String getFirstName() {
        return this.firstName;
    }
    
    //sets first name
    public void setFirstName( String newFirstName ) {
        this.firstName = newFirstName;
    }
    
    //returns last name
    public String getLastName() {
        return this.lastName;
    }
    
    //sets last name
    public void setLastName( String newLastName ) {
        this.lastName = newLastName;
    }
    
    //returns social security number
    public String getSocialSecurity() {
        return this.socialSecurityNumber;
    }
    
    //set social security number
    public void setSocialSecurity( String newSocialSecurity ) {
        this.socialSecurityNumber = newSocialSecurity;
    }
    
    //overrides string to a special format
    @Override
    public String toString() {
        return String.format(this.firstName + " " + this.lastName + "\nSocial Security Number: " 
                + this.socialSecurityNumber + "\n" + this.compensationModel.toString() + "\n");
    }
    
}
