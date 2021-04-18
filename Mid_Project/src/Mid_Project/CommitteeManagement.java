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
    public static ArrayList<FYPMembers> listMembers = new ArrayList<>();
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
            saveStudentData(getStdList());
            System.out.println("Student");
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void addProject(Project project) {
        project.setterProject(project.getprojectTitle(), project.getprojectType(),
                project.getProjectDescription(), project.getProjectAdvisor());
        list1.add(project);
        saveProjectData(getProjectList());
        System.out.println("Project");
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

    public void setStdList(ArrayList<BasicInfo> list) {
        list = this.stdlist;
    }

    public List<Project> getProjectList() {
        return list1;
    }

    public void setProjectList(ArrayList<Project> list) {
        list = this.list1;
    }

    public List<FypRubrics> getRubricsList() {
        return rubricsList;
    }

    public List<FypEvaluation> getEvaluations() {
        return evaluationList;
    }
    public List<FYPMembers> getMembers()
    {
        return  listMembers;
    }
    public void setMembersList(ArrayList<FYPMembers> list)
    {
        list = this.listMembers;
    }

    public void addFypMembers(FYPMembers F) {
        

             listMembers.add(F);
             
            
            
        

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
                Advisor Ad = (Advisor) getList().get(i);
                fr.write(Ad.getName() + "," + Ad.getEmailId() + "," + Ad.getDomain() + "," + Ad.getContactNumber() + "," + Ad.getWorkPlaceNumber() + "," + Ad.getPassword() + "\n");
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
                Ad.setPassword(arr[5]);
                list.add(Ad);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");

        }

    }

    public boolean saveStudentData(List<BasicInfo> list) {
        boolean flag = false;
        try {

            FileWriter fr = new FileWriter("Student.txt");

            for (int i = 0; i < stdlist.size(); i++) {
                Student std = (Student) getStdList().get(i);
                fr.write(std.getName() + "," + std.getEmailId() + "," + std.getStudentId() + "," + std.getCnic() + "," + std.getSession() + "," + std.getContactNumber() + "," + std.getGender() + "," + std.getCroupID() + ","
                        + std.getPassword() + "\n");
                flag = true;
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occured! File Not Found");
            flag = false;
        }

        return flag;
    }

    public void loadStudentData() {
        try {

            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            String inputFromFile = br.readLine();
            for (int i = 0; inputFromFile != null; i++) {
                String[] arr = inputFromFile.split(",");
                Student std = new Student();
                std.setName(arr[0]);
                std.setEmailId(arr[1]);
                std.setStudentId(arr[2]);
                std.setCnic(arr[3]);
                std.setSession(arr[4]);
                std.setContactNumber(arr[5]);
                std.setGender(arr[6]);
                std.setGroupId(arr[7]);
                std.setPassword(arr[8]);
                stdlist.add(std);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");

        }

    }

    public boolean saveProjectData(List<Project> list) {
        boolean flag = false;
        try {

            FileWriter fr = new FileWriter("Project.txt");

            for (int i = 0; i < list1.size(); i++) {
                fr.write(list1.get(i).getprojectTitle() + "," + list1.get(i).getprojectType() + "," + list1.get(i).getProjectDescription() + "," + list1.get(i).getProjectAdvisor()
                        + "\n");
                flag = true;
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occured! File Not Found");
            flag = false;
        }

        return flag;
    }

    public void loadProjectData() {
        try {

            FileReader fr = new FileReader("Project.txt");
            BufferedReader br = new BufferedReader(fr);
            String inputFromFile = br.readLine();
            for (int i = 0; inputFromFile != null; i++) {
                String[] arr = inputFromFile.split(",");
                Project P = new Project();
                P.setProjectTitle(arr[0]);
                P.setProjectType(arr[1]);
                P.setDescription(arr[2]);
                P.setProjectAdvisor(arr[3]);
                list1.add(P);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();

        }

    }
/*
    public boolean saveFypEvaluationData(List<FypEvaluation> list) {
        boolean flag = false;
        try {

            FileWriter fr = new FileWriter("Evaluation.txt");

            for (int i = 0; i < evaluationList.size(); i++) {
                fr.write(evaluationList.get(i).getPresentationMark() + "," + evaluationList.get(i).getProposalMark() + "," + evaluationList.get(i).getOutputMarks() + "," + evaluationList.get(i).getProjectDissertationMark()
                        + "," + evaluationList.get(i).getProjectLogBookMark() + "," + evaluationList.get(i).getProjectWorkshopMark()
                        + "," + evaluationList.get(i).getTotal() + "\n");
                flag = true;
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occured! File Not Found");
            ex.printStackTrace();
            flag = false;
        }

        return flag;
    }

    public void loadFypEvaluationData() {
        try {

            FileReader fr = new FileReader("Evaluation.txt");
            BufferedReader br = new BufferedReader(fr);
            String inputFromFile = br.readLine();
            for (int i = 0; inputFromFile != null; i++) {
                String[] arr = inputFromFile.split(",");
                FypEvaluation evaluation = new FypEvaluation();
                double d = Double.parseDouble(arr[0]);
                evaluation.setPresentationMark(d);
                double d1 = Double.parseDouble(arr[1]);
                evaluation.setMark(d1);
                double d2 = Double.parseDouble(arr[2]);
                evaluation.setOutputMark(d2);
                double d3 = Double.parseDouble(arr[3]);
                evaluation.setDissertationMark(d3);
                double d4 = Double.parseDouble(arr[4]);
                evaluation.setLogBookMark(d4);
                double d5 = Double.parseDouble(arr[5]);
                evaluation.setWorkshopMark(d5);
                double d6 = Double.parseDouble(arr[6]);
                evaluation.setTotal(d6);
                evaluationList.add(evaluation);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");

        }

    }

    public boolean saveFypEvaluationRecord(List<FypEvaluation> list) {
        boolean flag = false;
        try {

            FileWriter fr = new FileWriter("EvaluationRecord.txt");

            for (int i = 0; i < evaluationList.size(); i++) {
                fr.write(evaluationList.get(i).getGrade() + "," + evaluationList.get(i).getEffort() + "," + evaluationList.get(i).getRemark() + "\n");
                flag = true;
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occured! File Not Found");
            ex.printStackTrace();
            flag = false;
        }

        return flag;
    }

    public void loadFypEvaluationRecord() {
        try {

            FileReader fr = new FileReader("EvaluationRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String inputFromFile = br.readLine();
            for (int i = 0; inputFromFile != null; i++) {
                String[] arr = inputFromFile.split(",");
                FypEvaluation evaluation = new FypEvaluation();
                evaluation.setGrade(arr[0]);
                evaluation.setEffort(arr[1]);
                evaluation.setRemark(arr[2]);
                evaluationList.add(evaluation);
                inputFromFile = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();

        }

    }
*/


}
