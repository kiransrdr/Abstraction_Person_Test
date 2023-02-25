/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismteachertest;

/**
 *
 * @author DELL
 */
public abstract class Teacher implements Payable {
    public String courseName;
    public int numoflec;
    public Teacher(String cname){
        this.courseName=cname;
        
    }
    public String toString(){
    return "";
    }
}
