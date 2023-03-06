/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchaning;

public class Base {
    protected String name;
    public Base(){
        this("oop");
        System.out.println("default constructor of base class");
    }
    public Base(String name){
        this.name=name;
        System.out.println("one constructor constructor of base class");
    }
    
}
