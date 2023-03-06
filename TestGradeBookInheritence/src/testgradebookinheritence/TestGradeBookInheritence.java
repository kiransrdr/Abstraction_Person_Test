/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgradebookinheritence;

/**
 *
 * @author fa14-bcs-124
 */
public class TestGradeBookInheritence {

    public static void main(String[] args) {
        Author[] authors = new Author[2];
authors[0] = new Author("PAUL Deitel", " Paul@nowhere.com ", 'm');
authors[1] = new Author("Harvey Deitel", "Paul@nowhere.com", 'm');

Book book1 = new Book("Java How to Program", authors, 19.99, 99);
System.out.println(book1);


    }
    
}
