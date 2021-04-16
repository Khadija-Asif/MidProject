/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mid_Project;


/**
 *
 * @author KHADIJA
 */
public class BasicInfo {

    private String name;
    private String emailID;
    private String contactNumber;
    private String password;

    /**
     * Function to set Name
     *
     * @param Name
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * Function to set Email
     *
     * @param email
     */
    public void setEmailId(String email) {
        this.emailID = email;
    }

    /**
     * Function to set Number
     *
     * @param number
     */
    public void setContactNumber(String number) {
        this.contactNumber = number;
    }

    /**
     * Function to set password
     *
     * @param pass
     */
    public void setPassword(String pass) {
        this.password = pass;
    }

    /**
     * getter function to get Name
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function to get Email Id
     *
     * @return
     */
    public String getEmailId() {
        return this.emailID;
    }

    /**
     * Function to get Contact Number
     *
     * @return
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Function to get Password
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Function to get class type
     *
     * @return
     */
    public String getType() {
        return "BasicInfo";
    }
    /**
     * toString function
     * @return 
     */
    public String toString() {
        return this.contactNumber + this.name + this.emailID;
    }
   
    /**
     * Function to set email , name , number 
     * @param name
     * @param num
     * @param email 
     */
    public void setter(String name, String num, String email) {
        this.name = name;
        this.contactNumber = num;
        this.emailID = email;
    }

}
