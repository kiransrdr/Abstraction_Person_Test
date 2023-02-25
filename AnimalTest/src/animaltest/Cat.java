/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaltest;

 
public class Cat implements Animal{
    
    public void Eat()
    {
        System.out.println("cat likes to eat meet");
    }
    public String MakeSound(){
        return "cat sounds mao mao mao";
    }
    public void NoLegs(){
        System.out.println("cat has four legs");
    }
    public String method(){
        return "second interface methof in Dog";
    }
}
