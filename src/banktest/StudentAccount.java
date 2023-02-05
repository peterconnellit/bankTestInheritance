/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banktest;

/**
 *
 * @author peter
 */
public class StudentAccount extends Account {
    private String pr_placeOfStudy;

    public StudentAccount(String na, int ac, double ba, String placeOfStudy) {
        super(na, ac, ba);
        pr_placeOfStudy = placeOfStudy;
    }

    public String getPlaceOfStudy() {
        return pr_placeOfStudy;
    }
}

