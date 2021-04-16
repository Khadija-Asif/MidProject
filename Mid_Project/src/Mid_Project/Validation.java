/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mid_Project;

import javax.swing.JOptionPane;

/**
 *
 * @author KHADIJA
 */
public class Validation {

    public boolean isValidEmailId(String email) {
        boolean check = false;
        int size = email.length();
        if (size <= 25) {
            if (!(email.charAt(0) >= '0' && email.charAt(0) <= '9')) {
                for (int i = 0; i <= size - 1; i++) {
                    if ((email.charAt(i) >= 'A' && email.charAt(i) <= 'Z') || (email.charAt(i) >= 'a' && email.charAt(i) <= 'z') || email.charAt(i) == '@' || email.charAt(i) == '.' || (email.charAt(i) >= '0' && email.charAt(i) <= '9')) {
                        check = true;

                    } else {
                        JOptionPane.showMessageDialog(null, "valid Email");
                        break;
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Size of Email is not more than 25");
        }
        return check;

    }

    public boolean isValidContactNumber(String number) {
        boolean check = false;
        int size = number.length();
        if (size == 11) {
            for (int i = 0; i <= size - 1; i++) {
                if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {
                    check = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "size of the number is more than 11");
        }

        return check;
    }

    public boolean isValidName(String name) {
        boolean flag = false;
        int size = name.length();
        if (size <= 30) {
            for (int i = 0; i <= size - 1; i++) {
                if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || name.charAt(i) == ' ') {
                    flag = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "size of the name is more than 30");
        }

        return flag;
    }

    public boolean isValidDomain(String Domain) {

        boolean flag = false;
        for (int i = 0; i <= Domain.length() - 1; i++) {
            if ((Domain.charAt(i) >= 'A' && Domain.charAt(i) <= 'Z') || (Domain.charAt(i) >= 'a' && Domain.charAt(i) <= 'z') || Domain.charAt(i) == ' ') {
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Domain");
            }

        }
        return flag;
    }

    public boolean isValidStudentID(String StdId) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean check = false;

        for (int i = 0; i < 4; i++) {
            if (StdId.charAt(i) >= '0' && StdId.charAt(i) <= '9') {
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Student ID");
            }

        }
        for (int i = 4; i < 6; i++) {
            if ((StdId.charAt(i) >= 'A' && StdId.charAt(i) <= 'Z') || (StdId.charAt(i) >= 'a' && StdId.charAt(i) <= 'z')) {
                flag1 = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Student ID");
            }

        }
        for (int i = 6; i < 9; i++) {
            if (StdId.charAt(i) >= '0' && StdId.charAt(i) <= '9') {
                flag2 = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Student ID");
            }

        }
        if (StdId.charAt(9) == '@' && StdId.charAt(10) == 's' && StdId.charAt(11) == 't' && StdId.charAt(12) == 'u' && StdId.charAt(13) == 'd' && StdId.charAt(14) == 'e'
                && StdId.charAt(15) == 'n' && StdId.charAt(16) == 't' && StdId.charAt(17) == '.' && StdId.charAt(18) == 'u'
                && StdId.charAt(19) == 'e' && StdId.charAt(20) == 't' && StdId.charAt(21) == '.' && StdId.charAt(22) == 'e' && StdId.charAt(23) == 'd'
                && StdId.charAt(24) == 'u' && StdId.charAt(25) == '.' && StdId.charAt(26) == 'p' && StdId.charAt(27) == 'k') {
            flag3 = true;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Student ID");
        }

        if (flag == true && flag1 == true && flag2 == true && flag3 == true) {
            check = true;
        }
        return check;
    }

    public boolean isValidCnic(String cnic) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean check = false;
        int size = cnic.length();
        if (size == 15) {
            for (int i = 0; i < 5; i++) {
                if (cnic.charAt(i) >= '0' && cnic.charAt(i) <= '9') {
                    flag = true;
                }
            }
            if (cnic.charAt(5) == '-') {
                flag1 = true;
            }
            for (int i = 6; i < 13; i++) {
                if (cnic.charAt(i) >= '0' && cnic.charAt(i) <= '9') {
                    flag2 = true;
                }
            }
            if (cnic.charAt(13) == '-' || (cnic.charAt(14) >= '0' && cnic.charAt(14) <= '9')) {
                flag3 = true;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cnic Size is not Valid");
        }

        if (flag == true && flag1 == true && flag2 == true && flag3 == true) {
            check = true;
        }

        return check;
    }

    public boolean isValidSession(String session) {
        boolean check = false;
        int size = session.length();
        if (size == 4) {

            for (int i = 0; i <= size - 1; i++) {
                if (session.charAt(i) >= '0' && session.charAt(i) <= '9') {
                    check = true;
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Session Size is not Valid");
        }
        return check;
    }

    public boolean isValidGroupId(String id) {
        boolean check = false;
        boolean flag = false;
        boolean flag3 = false;
        String c = id.substring(0, 3);
        if (c.equals("ID-")) {
            flag = true;
        }

        for (int i = 3; i <= id.length() - 1; i++) {
            if (id.charAt(i) >= '0' && id.charAt(i) <= '9') {
                flag3 = true;
            } else {
                flag3 = false;
                JOptionPane.showMessageDialog(null, "Invalid Group ID");
                break;

            }

        }
        if (flag == true && flag3 == true) {
            check = true;
        }
        return check;
    }

    public boolean isValidProjecTitle(String title) {
        boolean check = false;
        int size = title.length();
        if (size <= 50) {
            for (int i = 0; i <= size - 1; i++) {
                if ((title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') || (title.charAt(i) >= 'a' && title.charAt(i) <= 'z') || title.charAt(i) == ' ') {
                    check = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Project Title");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Size of the Title is more than 50");
        }
        return check;
    }
}
