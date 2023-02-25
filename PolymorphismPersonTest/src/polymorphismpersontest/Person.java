/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismpersontest;

/**
 *
 * @author DELL
 */
public abstract class Person {
   private String name;
   private String gender;
   public Person(String nm,String gen){
       this.name=nm;
       this.gender=gen;
   }
   public abstract void work();
   public String toString(){
       return "name"+this.name+"Gender"+this.gender;
   }
}
