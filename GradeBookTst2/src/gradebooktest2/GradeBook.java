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
class GradeBook {
    private String cname;
    private int marks;
    public GradeBook(   ){
        
    }
    public GradeBook(String coursename,int mrks){
        cname=coursename;
        marks=mrks;
    }
    public void setName(String name){
        
        cname=name;
    }
    public String getName(){
        return cname;
    }
    public void setGrades(int mrks){
        marks=mrks;
    }
    public int getGrades(){
        return marks;
    }
    public void showMessage(){
        System.out.printf("Welcome to the Grade Book of %s \n", getName());
         System.out.printf("you got %s \n", getGrades());
    }
    public void CalculateGrade(int mrks){
        if(mrks>=50)
            System.out.println("Status: passed");
        else
            System.out.println("Status: failed");
    }
}
