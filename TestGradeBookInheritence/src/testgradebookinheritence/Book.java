 
package testgradebookinheritence;
 
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;
    public Book(String name,Author[] authors,double price,int qty)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getAuthorsName(){
        String str="";
        for(int i=0;i<authors.length;i++)
        {
            str+=authors[i];
        }
        return str;
    }
    
    public String toString() 
   {
        return String.format("Book{" +
                "name='" + name + '\'' +
                ",\nAuthors=" + getAuthorsName() +
                "price='" + price + '\'' +
                ",\nQuantity=" + qty +
                '}');
    }
}
