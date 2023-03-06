package teststudentinheritence;
public class Student extends Person{
    String[] course;
    double[] marks;
    public Student(String name,int age,String[] c,double[] m){
        super(name,age);
        course=c;
        marks=m;
    }
    public String getcourse(){
        String str="";
        for(int i=0;i<course.length;i++)
        {
            str+=course[i]+" ";
        }
        return str;
    }
    public String getmarks(){
        String str="";
        for(int i=0;i<marks.length;i++)
        {
            str+=marks[i]+" ";
        }
        return str;
    }
   public String toString()
   {
        return String.format(" courses %s \n In marks  %s , \n  marks %s",super.toString(),getcourse(),getmarks());
   }
}
