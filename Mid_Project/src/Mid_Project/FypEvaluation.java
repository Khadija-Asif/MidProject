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
public class FypEvaluation {

    private double presentationMark;
    private double proposalMark;
    private double projectOutMark;
    private double projectDissertationMark;
    private double projectLogBookMark;
    private double projectWorkshop;
    private String Grade;
    private String remark;
    private String Effort;
    private String conclusion;
    private String Status;
    private String problemAnalysis;

    /**
     * function to set proposal mark
     *
     * @param marks
     */
    public void setMark(double marks) {
        this.proposalMark = marks;
    }

    /**
     * setter function to set presentation mark
     *
     * @param marks
     */
    public void setPresentationMark(double marks) {
        this.presentationMark = marks;
    }

    /**
     * Function to set Output marks
     *
     * @param marks
     */
    public void setOutputMark(double marks) {
        this.projectOutMark = marks;
    }

    /**
     * Function to set Dissertation marks
     *
     * @param marks
     */
    public void setDissertationMark(double marks) {
        this.projectDissertationMark = marks;
    }

    /**
     * Function to set FYP logBook Marks
     *
     * @param marks
     */
    public void setLogBookMark(double marks) {
        this.projectLogBookMark = marks;
    }

    /**
     * Function to set FYP workshop marks
     *
     * @param marks
     */
    public void setWorkshopMark(double marks) {
        this.projectWorkshop = marks;
    }

    /**
     * function to set grade
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.Grade = grade;
    }

    /**
     * function to set Remark after FYP Evaluation
     *
     * @param Remark
     */
    public void setRemark(String Remark) {
        this.remark = Remark;
    }

    /**
     * function to set effort for FYP
     *
     * @param effort
     */
    public void setEffort(String effort) {
        this.Effort = effort;
    }

    /**
     * function to set conclusion
     *
     * @param concl
     */
    public void setConclusion(String concl) {
        this.conclusion = concl;
    }

    /**
     * function to set status after Evaluation whether the project's result is
     * bad, good or Excellent
     *
     * @param status
     */
    public void setStatus(String status) {
        this.Status = status;
    }

    /**
     * Function to set problem and analysis
     *
     * @param probAnalysis
     */
    public void setProblemAnalysis(String probAnalysis) {
        this.problemAnalysis = probAnalysis;
    }

    /**
     * function to get grades
     *
     * @return
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * function to get remark after FYP Evaluation
     *
     * @return
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * function to easily access variable "Effort"
     *
     * @return
     */
    public String getEffort() {
        return this.Effort;
    }

    /**
     * @return
     */
    public String getConclusion() {
        return this.conclusion;
    }

    /**
     * function to get Status
     *
     * @return
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * getter function to easily access variable
     *
     * @return
     */
    public String getProblemAnalysis() {
        return this.problemAnalysis;
    }

    /**
     * to get proposal marks
     *
     * @return
     */
    public double getProposalMark() {
        return this.proposalMark;
    }

    /**
     * to get presentation marks
     *
     * @return
     */
    public double getPresentationMark() {
        return this.presentationMark;
    }

    /**
     * to get output marks
     *
     * @return
     */
    public double getOutputMarks() {
        return this.projectOutMark;
    }

    /**
     * to get project dissertation mark
     *
     * @return
     */
    public double getProjectDissertationMark() {
        return this.projectDissertationMark;
    }

    /**
     * to get project Log Book marks
     *
     * @return
     */
    public double getProjectLogBookMark() {
        return this.projectLogBookMark;
    }

    /**
     * to get Project Workshop Marks
     *
     * @return
     */
    public double getProjectWorkshopMark() {
        return this.projectWorkshop;
    }
    public void setter(double marks1 , double marks2 , double marks3 , double marks4 , double marks5 , double marks6)
    {
        this.presentationMark = marks1;
        this.proposalMark = marks2;
        this.projectOutMark = marks3;
        this.projectDissertationMark = marks4;
        this.projectLogBookMark = marks5;
        this.projectWorkshop = marks6;
    }
    public double setter()
    {
        return presentationMark + proposalMark + projectOutMark + projectDissertationMark + projectLogBookMark + projectWorkshop;
    }
}
