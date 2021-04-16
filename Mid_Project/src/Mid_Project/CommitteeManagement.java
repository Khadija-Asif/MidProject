/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mid_Project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author KHADIJA
 */
public class CommitteeManagement {

    public static ArrayList<BasicInfo> list = new ArrayList<BasicInfo>();
    public static ArrayList<BasicInfo> stdlist = new ArrayList<BasicInfo>();
    public static ArrayList<Project> list1 = new ArrayList<Project>();
    public static ArrayList<FypRubrics> rubricsList = new ArrayList<FypRubrics>();
    public static ArrayList<FypEvaluation> evaluationList = new ArrayList<FypEvaluation>();
    private static CommitteeManagement smpl;

    private CommitteeManagement() {

    }

    public static CommitteeManagement getInstance() {
        if (smpl == null) {
            smpl = new CommitteeManagement();
            return smpl;
        }
        return smpl;
    }

    public void add(BasicInfo B) {
        if (B.getType().equals("Advisor")) {
            list.add(B);
            System.out.println("Advisor");
        } else if (B.getType().equals("Student")) {
            stdlist.add(B);
            System.out.println("Student");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void addProject(Project project) {
        project.setterProject(project.getprojectTitle(), project.getprojectType(),
                project.getProjectDescription(), project.getProjectAdvisor());
        list1.add(project);
    }

    public List<BasicInfo> getList() {
        return list;
    }

    public List<BasicInfo> getStdList() {
        return stdlist;
    }

    public List<Project> getProjectList() {
        return list1;
    }

    public List<FypRubrics> getRubricsList() {
        return rubricsList;
    }
     
    public List<FypEvaluation> getEvaluations()
    {
        return this.evaluationList;
    }
    
    public void addFypMembers(BasicInfo B) {
        stdlist.add(B);

    }

    public void EvaluateFyp(FypEvaluation Fyp) {

        Fyp.setter(Fyp.getPresentationMark(), Fyp.getProposalMark(), Fyp.getOutputMarks(),
                Fyp.getProjectDissertationMark(), Fyp.getProjectLogBookMark(), Fyp.getProjectWorkshopMark());
        evaluationList.add(Fyp);
        

    }

    public void addRubric(FypRubrics R) {
        rubricsList.add(R);
    }

}
