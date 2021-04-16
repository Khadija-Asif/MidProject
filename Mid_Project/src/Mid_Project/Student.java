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
public class Student extends BasicInfo {

    private String StudentID;
    private String Cnic;
    private String session;
    private String gender;
    private String GroupID;
    private String selectedProject;

    /**
     * Function to set Student ID
     *
     * @param ID
     */
    public void setStudentId(String ID) {
        this.StudentID = ID;
    }

    /**
     * Function to set CNIC
     *
     * @param cnic
     */
    public void setCnic(String cnic) {
        this.Cnic = cnic;
    }

    /**
     * Function to set session
     *
     * @param session
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * Function to set gender
     *
     * @param gen
     */
    public void setGender(String gen) {
        this.gender = gen;
    }

    /**
     * Function to set GROUP ID
     *
     * @param gID
     */
    public void setGroupId(String gID) {
        this.GroupID = gID;
    }

    /**
     * Function to get Student ID
     *
     * @return
     */
    public String getStudentId() {
        return this.StudentID;
    }

    /**
     * Function to get Session
     *
     * @return
     */
    public String getSession() {
        return this.session;
    }

    /**
     * Function to get gender
     *
     * @return
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Function to get CNIC
     *
     * @return
     */
    public String getCnic() {
        return this.Cnic;
    }

    /**
     * Function to get Group Id
     *
     * @return
     */
    public String getCroupID() {
        return this.GroupID;
    }

    /**
     * to set the specific project from the list
     *
     * @param project
     */
    public void setSelectedProject(String project) {
        this.selectedProject = project;
    }
    
    /**
     * to get student selected project
     * @return 
     */
    public String getStdProject() {
        return this.selectedProject;
    }

    /**
     * Function to get class type
     *
     * @return
     */
    @Override
    public String getType() {
        return "Student";
    }

}
