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

    private String presentationMark;
    private String proposalMark;
    private String projectOutMark;
    private String projectDissertationMark;
    private String projectLogBookMark;
    private String projectWorkshop;
    private String Grade;
    private String remark;
    private String Effort;
    private String Status;
    private String TotalMarks;

    /**
     * function to set proposal mark
     *
     * @param marks
     */
    public void setMark(String marks) {
        this.proposalMark = marks;
    }

    /**
     * setter function to set presentation mark
     *
     * @param marks
     */
    public void setPresentationMark(String marks) {
        this.presentationMark = marks;
    }

    /**
     * Function to set Output marks
     *
     * @param marks
     */
    public void setOutputMark(String marks) {
        this.projectOutMark = marks;
    }

    /**
     * Function to set Dissertation marks
     *
     * @param marks
     */
    public void setDissertationMark(String marks) {
        this.projectDissertationMark = marks;
    }

    /**
     * Function to set FYP logBook Marks
     *
     * @param marks
     */
    public void setLogBookMark(String marks) {
        this.projectLogBookMark = marks;
    }

    /**
     * Function to set FYP workshop marks
     *
     * @param marks
     */
    public void setWorkshopMark(String marks) {
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
     * function to get Status
     *
     * @return
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * to get proposal marks
     *
     * @return
     */
    public String getProposalMark() {
        return this.proposalMark;
    }

    /**
     * to get presentation marks
     *
     * @return
     */
    public String getPresentationMark() {
        return this.presentationMark;
    }

    /**
     * to get output marks
     *
     * @return
     */
    public String getOutputMarks() {
        return this.projectOutMark;
    }

    /**
     * to get project dissertation mark
     *
     * @return
     */
    public String getProjectDissertationMark() {
        return this.projectDissertationMark;
    }

    /**
     * to get project Log Book marks
     *
     * @return
     */
    public String getProjectLogBookMark() {
        return this.projectLogBookMark;
    }

    /**
     * to get Project Workshop Marks
     *
     * @return
     */
    public String getProjectWorkshopMark() {
        return this.projectWorkshop;
    }
    public void setter(String marks1 , String marks2 , String marks3 , String marks4 , String marks5 , String marks6,String total)
    {
        this.presentationMark = marks1;
        this.proposalMark = marks2;
        this.projectOutMark = marks3;
        this.projectDissertationMark = marks4;
        this.projectLogBookMark = marks5;
        this.projectWorkshop = marks6;
        this.TotalMarks = total;
    }
    public void setTotal(String total)
    {
        this.TotalMarks = total;
    }
    public String getTotal()
    {
        return this.TotalMarks;
    }
    public String getter()
    {
        return this.presentationMark + this.proposalMark + this.projectOutMark + this.projectDissertationMark + this.projectLogBookMark + this.projectWorkshop + this.TotalMarks;
    }
}
