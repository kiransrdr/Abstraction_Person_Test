/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismpersontest;

/**
 *
 * @author DELL
 */
public class Employee extends Person{
    private int empid;
    public Employee(String nm,String gen,int id){
        super(nm,gen);
        this.empid=id;
    }
    public void work(){
        if(empid==0)
            System.out.println("Not working");    
        else
            System.out.println("working as empoyee");
        
    }
    
    
    
}
