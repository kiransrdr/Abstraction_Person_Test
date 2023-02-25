/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractshapetest;

 
public class AbstractShapeTest {
 
    public static void main(String[] args) {
        Shape[] shape=new Shape[2];
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        draw_shape(c);
        draw_shape(r);
        
        /*for(Shape obj:s){
            obj.draw();
            if(obj instanceof Circle){ 
            Circle x=(Circle)obj;
            x.color();
            }
        }*/
    }
    public static void draw_shape(Shape s){
        s.draw();
        
        
    }
    
}
