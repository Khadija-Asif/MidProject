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
public class FYPMembers {

    private String MemeberName;
    private String MemberID;
    private String MemberSession;
    private String memberGroupID;
    private String SelectedProject;

    public void setSelectedProject(String project) {
        this.SelectedProject = project;
    }

    public void setMemberName(String name) {
        this.MemeberName = name;
    }

    public String getMemberName() {
        return this.MemeberName;
    }

    public void setMemberID(String memID) {
        this.MemberID = memID;
    }

    public String getMemID() {
        return MemberID;
    }
    public String getMemGroupId()
    {
        return this.memberGroupID;
    }
    public void setMemGrouID(String groupId)
    {
        this.memberGroupID = groupId;
    }
    public String get() {
        return this.MemberSession;
    }

    public void setMemberSession(String sess) {
        this.MemberSession = sess;
    }

    public void setterMember(String name, String ID, String stdId, String memberSession, String project) {
        this.MemeberName = name;
        this.memberGroupID = ID;
        this.MemberID = stdId;
        this.MemberSession = memberSession;
        this.SelectedProject = project;
    }
    public String getterMember()
    {
        return this.MemeberName + this.memberGroupID + this.MemberID + this.MemberSession + this.SelectedProject;
    }

    /**
     * to get student selected project
     *
     * @return
     */
    public String getStdProject() {
        return this.SelectedProject;
    }

}
