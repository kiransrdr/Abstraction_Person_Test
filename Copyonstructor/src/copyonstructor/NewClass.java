/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copyonstructor;

public class NewClass {
    public String courseName;
    public int creditHours;
    public NewClass(String name, int value){
        System.out.println("Two Argument Constructor");
        this.courseName=name;
        this.creditHours=value;
    }
    public NewClass(NewClass obj){
        System.out.println("Copy Constructor");
        this.courseName=obj.courseName;
        this.creditHours=obj.creditHours;
    }
    public String toString(){
return  String.format("Course Name: %s with CreditHours %d",courseName,creditHours);
    }

}
