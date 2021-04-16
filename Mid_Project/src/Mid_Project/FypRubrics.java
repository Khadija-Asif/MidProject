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
public class FypRubrics {

    private String presentationEvaluation;
    private String proposal;
    private String projectOutput;
    private String Dissertation;
    private String LogBook;
    private String Workshop;

    /**
     * to set presentation Rubric
     *
     * @param presentation
     */
    public void setPresentationRubrics(String presentation) {
        this.presentationEvaluation = presentation;
    }

    /**
     * to set Proposal Rubric
     *
     * @param proposal
     */
    public void setProposalRubrics(String proposal) {
        this.proposal = proposal;
    }

    /**
     * to set Output Rubric
     *
     * @param Output
     */
    public void setOutputRubrics(String Output) {
        this.projectOutput = Output;
    }

    /**
     * to set Dissertation Rubric
     *
     * @param dissertation
     */
    public void setDissertationRubrics(String dissertation) {
        this.Dissertation = dissertation;
    }

    /**
     * to set LogBook Rubric
     *
     * @param LogBook
     */
    public void setLogBookRubrics(String LogBook) {
        this.LogBook = LogBook;
    }

    /**
     * to set Workshop Rubric
     *
     * @param workshop
     */
    public void setWorkshopRubrics(String workshop) {
        this.Workshop = workshop;
    }

    /**
     * getter Function to get presentation rubric
     *
     * @return
     */
    public String getPresentationRubric() {
        return this.presentationEvaluation;
    }

    /**
     * getter function to get proposal rubric
     *
     * @return
     */
    public String getProposalRubrics() {
        return this.proposal;
    }

    /**
     * getter function to get output rubric
     *
     * @return
     */
    public String getOutputRubrics() {
        return this.projectOutput;
    }

    /**
     * getter function to get dissertation rubric
     *
     * @return
     */
    public String getDissertationRubrics() {
        return this.Dissertation;
    }

    /**
     * getter function to get LogBook rubric
     *
     * @return
     */
    public String getLogBookRubrics() {
        return this.LogBook;
    }

    /**
     * getter function to get workshop rubric
     *
     * @return
     */
    public String getWorkshopRubrics() {
        return this.Workshop;
    }

}
