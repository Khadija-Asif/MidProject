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
public class Project {

    private String projectTitle;
    private String projectType;
    private String description;
    private String projectAdvisor;

    /**
     * function to set project title
     *
     * @param title
     */
    public void setProjectTitle(String title) {
        this.projectTitle = title;
    }

    /**
     * function to set Project Type
     *
     * @param type
     */
    public void setProjectType(String type) {
        this.projectType = type;
    }

    /**
     * function to set project description
     *
     * @param desc
     */
    public void setDescription(String desc) {
        this.description = desc;
    }

    /**
     * function to get project title
     *
     * @return
     */
    public String getprojectTitle() {
        return this.projectTitle;
    }

    /**
     * function to get project type
     *
     * @return
     */
    public String getprojectType() {
        return this.projectType;
    }

    /**
     * function to get project description
     *
     * @return
     */
    public String getProjectDescription() {
        return this.description;
    }
    /**
     * setter function
     * @param title
     * @param type
     * @param description 
     */
    public void setterProject(String title , String type , String description , String advisor)
    {
        this.projectTitle = title;
        this.projectType = type;
        this.description = description;
        this.projectAdvisor = advisor;
    }
    
    /**
     * getter function
     * @return 
     */
    public String getterProject()
    {
        return this.projectTitle + this.projectType + this.description + this.projectAdvisor;
    }
    /**
     * getter function to get project Advisor
     * @return 
     */
    public String getProjectAdvisor()
    {
        return this.projectAdvisor;
    }
    /**
     * to set Project Advisor
     * @param advisor 
     */
    public void setProjectAdvisor(String advisor)
    {
        this.projectAdvisor = advisor;
    }

}
