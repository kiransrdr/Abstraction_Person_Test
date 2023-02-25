 
package filehandlintest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 
public class FileHandlinTest {
 
    public static void main(String[] args) {
         try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            String st="Hello i am a programmer";
            byte[] b=st.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("succes....."); 
        }
        catch(IOException e){
            System.out.println("wuriting in file error"+e);
        
        }
        try{
            
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
            fin.close();
             
        }
        catch(IOException e)
        {
            System.out.println("reading in file error"+e);
        }
       
        
    }
}
