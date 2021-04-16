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
public class Advisor extends BasicInfo {

    private String domain;
    private String workPlaceNumber;

    /**
     * function to set domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * function to set number
     *
     * @param workNum
     */
    public void setWorkPlaceNumber(String workNum) {
        this.workPlaceNumber = workNum;

    }

    /**
     * Function to get Domain of an advisor
     *
     * @return
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Function to get Number
     *
     * @return
     */
    public String getWorkPlaceNumber() {
        return this.workPlaceNumber;
    }
    /**
     * Function to set domain and work place Number
     * @param domain
     * @param workNum 
     */
    public void setAdvisor(String domain , String workNum)
    {
        this.domain = domain;
        this.workPlaceNumber = workNum;
    }
    /**
     * Function to get Class type
     *
     * @return
     */
    @Override
    public String getType() {
        return "Advisor";
    }

}
