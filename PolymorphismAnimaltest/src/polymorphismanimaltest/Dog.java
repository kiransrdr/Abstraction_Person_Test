/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismanimaltest;

/**
 *
 * @author DELL
 */
public class Dog implements Animal{

    @Override
    public void Eat() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dog likes to eat meat");
    }

    @Override
    public String MakeSound() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Dog sound wow wow wow";
    }
    public void NoLegs(){
        System.out.println("Dog has four legs");
    }
}
