/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktest;

/**
 *
 * @author peter
 */
public class JointAccount extends Account {
    private String pr_name2;

    public JointAccount(String na1, String na2, int ac, double ba) {
        super(na1, ac, ba);
        pr_name2 = na2;
    }

    public String getName2() {
        return pr_name2;
    }
}

