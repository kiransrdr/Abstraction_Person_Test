 
package polymorphismanimaltest;
 
public class PolymorphismAnimaltest {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d=new Dog();
        Cat c=new Cat();
        Animal[] animal=new Animal[2];
        animal[0]=d;
        animal[1]=c;
        for(Animal a:animal){
            a.Eat();
            System.out.println(a.MakeSound());
            if(a instanceof Cat)
                ((Cat) a).NoLegs();
                
            
        }
    }
    
}
