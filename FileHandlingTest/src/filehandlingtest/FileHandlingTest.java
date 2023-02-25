/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author fa14-bcs-124
 */
public class FileHandlingTest {
 
    public static void main(String[] args) { 
        try{
            FileOutputStream out=new FileOutputStream("abc.txt");
            String s="i want to save sentence";
            byte b[]=s.getBytes();
            out.write(b);
            out.close();
            System.out.println("Success.....");
            FileInputStream in=new FileInputStream("abc.txt");
            int i=0;
            while((i=in.read())!=-1)
            {
                System.out.print((char)i);
            }
            in.close();            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
