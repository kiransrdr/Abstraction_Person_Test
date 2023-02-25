/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaltest;
 
public class AnimalTest {
 
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c=new Cat();
        Animal[] A=new Animal[2];
        A[0]=d;
        A[1]=c;
        for(Animal a:A)
        {
            a.Eat();
            System.out.println(a.MakeSound());
            if(a instanceof Dog){
                Dog cc=(Dog)a;
                cc.NoLegs();
            }
        }
    }
}
