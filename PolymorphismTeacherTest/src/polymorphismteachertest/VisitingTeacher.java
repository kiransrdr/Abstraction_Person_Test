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
public class VisitingTeacher extends Teacher{
     public double salary;
     public int lectures;
     public String name;
    public VisitingTeacher(String name,double salary,String cname,int lectures){
        super(cname);
        this.name=name;
        this.salary=salary;
        this.lectures=lectures;
    }
    public String showInformation(){
        return "Visiting Teacher name"+this.name+ "Salary"+this.computesalary();
    }
    public double computesalary(){
        return salary*lectures;
    }
}
