/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpersontest;
 
public class AbstractPersonTest {
 
    public static void main(String[] args) {
        Person student=new Employee("Dove","Female",0);
        Person employee=new Employee("Pankaj","Male",123);
        student.work();
        employee.work();
        System.out.println(employee.toString());
        
    }
}
