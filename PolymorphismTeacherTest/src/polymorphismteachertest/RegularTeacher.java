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
public class RegularTeacher extends Teacher{
    public double salary;
    public String name;
    public RegularTeacher(String name,double salary,String cname){
        super(cname);
        this.name=name;
        this.salary=salary;
    }
    public double computesalary(){
        return salary*6;
    }
    public String toString(){
        return "Regular teacher name"+this.name+"salary"+this.computesalary();
    }
}
