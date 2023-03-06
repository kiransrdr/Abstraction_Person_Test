 
package teacherinterfacetest;
 
public class VisitingTeacher extends Teacher{
    public String name;
    public double salary; 
    public int noOdLec;
    public VisitingTeacher(String name,String courseName,double salary,int noOdLec){
        super(courseName);
        this.name=name;
        this.salary=salary;
        this.noOdLec=noOdLec;
    }
    public double computeSalary(){
        int perlec_salary=20000;
        return perlec_salary*noOdLec;
    }
    public String showInfo(){
         return String.format("Info:\nName=%s \t %s \t SAlary=%f", name,super.toString(),computeSalary());
    }
    public String toString(){
        return String.format("Name=%s \t %s \t SAlary=%f", name,super.toString(),computeSalary());
    }
}
