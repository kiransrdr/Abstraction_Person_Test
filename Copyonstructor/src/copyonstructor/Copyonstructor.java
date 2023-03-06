/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copyonstructor;

/**
 *
 * @author fa14-bcs-124
 */
public class Copyonstructor {

    public static void main(String[] args) {
       NewClass obj1=new NewClass("OOP ",4);
    System.out.println(obj1.toString());
    NewClass obj2=new NewClass(obj1);
    System.out.println(obj2.toString());    

    }
}
