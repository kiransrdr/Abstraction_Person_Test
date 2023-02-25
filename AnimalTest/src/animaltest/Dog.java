/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaltest;

/**
 *
 * @author fa14-bcs-124
 */
public class Dog implements Animal, AnotherInterface{
    public void Eat()
    {
        System.out.println("Dog likes to eat meet");
    }
    public String MakeSound(){
        return "Dog sounds wowo wow wow";
    }
    public void NoLegs(){
        System.out.println("Dog has four legs");
    }
    public String method(){
        return "second interface methof in Dog";
    }
    
}
