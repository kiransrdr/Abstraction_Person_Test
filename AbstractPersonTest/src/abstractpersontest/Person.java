
package abstractpersontest;

 
public abstract class Person {
    private String name;
    private String gender;
    public Person(String name,String gender){
        this.gender=gender;
        this.name=name;
    }
    public abstract void work();
    public String toString(){
        return String.format("Name=%s \t Gender=%s ", name,gender);
    }
    
    
}
