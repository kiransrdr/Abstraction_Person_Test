/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritancecalculator;

public class TestInheritanceCalculator {

    public static void main(String[] args) {
             int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
      Calculation obj=new Calculation();
      //obj.multiplication(a, b);
      SubClass obj1=new SubClass();
      obj1.superClassMethod();
      
    }
    
}
