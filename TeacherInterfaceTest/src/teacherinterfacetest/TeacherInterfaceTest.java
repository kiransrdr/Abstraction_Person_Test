 
package teacherinterfacetest;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TeacherInterfaceTest {
 
    public static void main(String[] args)  { 
        RegularTeacher regulartchr=null;
        Teacher[] t=new Teacher[2];
        RegularTeacher rt=new RegularTeacher( "Ali Khan", "OOP", 70000, 4);
        VisitingTeacher vt=new VisitingTeacher( "Saadia Khan", "OOP", 70000, 20);
        
        t[0]=rt;
        t[1]=vt;
        try{
            FileOutputStream fout=new FileOutputStream("teacher.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(rt);
            out.close();
            fout.close();
            
        }
        catch(IOException e){
            System.out.println("wuriting in file error"+e);
        
        }
        try{
            
            FileInputStream fin=new FileInputStream("teacher.ser");
            ObjectInputStream oin=new ObjectInputStream(fin);
            RegularTeacher obj=(RegularTeacher)oin.readObject();
            oin.close();
            fin.close();
             System.out.println("obj="+obj);
        }
        catch(IOException e){
            System.out.println("reading in file error"+e);
        }
        catch(ClassNotFoundException e){
        System.out.println("  file error"+e);
        }
        
       /* for(Teacher tchr:t)
        {
            System.out.println(tchr.toString());
            if(tchr instanceof VisitingTeacher){
                VisitingTeacher cc=(VisitingTeacher)tchr;
                System.out.println(cc.showInfo());
            }
        }*/ 
    }
}
