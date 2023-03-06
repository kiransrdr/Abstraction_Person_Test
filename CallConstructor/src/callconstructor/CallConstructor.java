/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callconstructor;

/**
 *
 * @author fa14-bcs-124
 */
public class CallConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass obj1=new NewClass();
        System.out.println(obj1.toString());
        NewClass obj2=new NewClass(obj1);

    }
}
