/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudentinheritence;

public class TestStudentInheritence {

    public static void main(String[] args) {
        // TODO code application logic here 
        String[] name={"oop","db"};
        double[] marks={23,55};
        Student obj=new Student("ali",23,name,marks);
        System.out.println(obj.toString());
        
    }
}
