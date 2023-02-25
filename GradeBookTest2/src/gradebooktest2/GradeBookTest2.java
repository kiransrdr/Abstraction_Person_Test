/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebooktest2;

/**
 *
 * @author fa14-bcs-124
 */
public class GradeBookTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GradeBook c1=new GradeBook();
        System.out.printf("c1 Default values : Course Name %s \n",c1.getName());
         c1.setName("Data Structure using Java");
        c1.showMessage();
        
        GradeBook c2=new GradeBook("oop",34); 
        System.out.printf("c2 Default values : Course Name %s \n",c2.getName());
       
        c2.setGrades(44);
      
        c2.showMessage();
    }
    
}
