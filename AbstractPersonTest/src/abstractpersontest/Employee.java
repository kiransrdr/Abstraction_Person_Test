/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpersontest;

 
public class Employee extends Person{
    private int empid;
    public Employee(String name,String gender,int empid){
        super(name,gender);
        this.empid=empid;
    }
    public void work(){
        if(empid==0)
            System.out.println("not working");
        else
            System.out.println("working as employee");
    }
    public String toString(){
        return String.format("Employee id=%d \t %s ",empid,super.toString());
    }
}
