/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mid_Project;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
            saveData(getList());
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

    public void setList(ArrayList<BasicInfo> list) {
        list = this.list;
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

    public List<FypEvaluation> getEvaluations() {
        return this.evaluationList;
    }

    public void addFypMembers(BasicInfo B) {
        stdlist.add(B);

    }

    public void EvaluateFyp(FypEvaluation Fyp) {

        Fyp.setter(Fyp.getPresentationMark(), Fyp.getProposalMark(), Fyp.getOutputMarks(),
                Fyp.getProjectDissertationMark(), Fyp.getProjectLogBookMark(), Fyp.getProjectWorkshopMark(), Fyp.getTotal());
        evaluationList.add(Fyp);

    }

    public void addRubric(FypRubrics R) {
        rubricsList.add(R);
    }

    public boolean saveData(List<BasicInfo> list) {
        boolean flag = false;
        try {

            FileWriter fr = new FileWriter("Advisor.txt");

            for (int i = 0; i < list.size(); i++) {
                Advisor Ad = (Advisor) list.get(i);
                fr.write(Ad.getName() + "," + Ad.getEmailId() + "," + Ad.getDomain() + "," + Ad.getContactNumber() + "," + Ad.getWorkPlaceNumber() /*+","+ Ad.getPassword()*/+ "\n");
                flag = true;
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occured! File Not Found");
            flag = false;
        }

        return flag;
    }

    public void loadData() {
        try {

            FileReader fr = new FileReader("Advisor.txt");
            BufferedReader br = new BufferedReader(fr);
            String inputFromFile = br.readLine();
            for (int i = 0; inputFromFile != null; i++) {
                String[] arr = inputFromFile.split(",");
                Advisor Ad = new Advisor();
                Ad.setName(arr[0]);
                Ad.setEmailId(arr[1]);
                Ad.setDomain(arr[2]);
                Ad.setContactNumber(arr[3]);
                Ad.setWorkPlaceNumber(arr[4]);
//                Ad.setPassword(arr[5]);
                //list.add(Ad);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");

        }

    }

}
