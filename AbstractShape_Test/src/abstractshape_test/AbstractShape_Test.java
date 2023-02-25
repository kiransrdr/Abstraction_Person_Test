 
package abstractshape_test;
 
public class AbstractShape_Test {
 
    public static void main(String[] args) { 
        Triangle t=new Triangle("Red",2,2);
        Rectangle r=new Rectangle("Green",2,2);
        show_shape(t);
        show_shape(r);   
    }
    public static void show_shape(Shape s){
        System.out.println(s.toString());
    }
    
}
