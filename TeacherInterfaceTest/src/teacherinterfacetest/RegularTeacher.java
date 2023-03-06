 
package teacherinterfacetest;

 
public class RegularTeacher extends Teacher implements java.io.Serializable{
    public String name;
    public double salary;
    public int months;
    private String cname;
    public RegularTeacher(String name,String CourseName,double salary,int months){
        super(CourseName);
        cname=CourseName;
        this.name=name;
        this.salary=salary;
        this.months=months;
    }
    public double computeSalary(){ 
        return  salary*months;
    }
    public String toString(){
        return String.format("Name=%s \t %s  \t SAlary= %f", name,super.toString(),computeSalary());
    }
    
}
