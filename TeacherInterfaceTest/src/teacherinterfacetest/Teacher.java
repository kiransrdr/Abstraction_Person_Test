 
package teacherinterfacetest;

public abstract class Teacher implements Payable, java.io.Serializable{
    public String course_nmae;
    
    public Teacher(String name){
        this.course_nmae=name;
    }
    public String toString(){
        return String.format("Course Name=%s",course_nmae);
    
    }
}
