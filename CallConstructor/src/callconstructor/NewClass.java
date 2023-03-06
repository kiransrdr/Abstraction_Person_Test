
package callconstructor;

public class NewClass { 
    int x;
    int y;
    
    public NewClass(){
        this(3);
        System.out.println("Default Constuctor");
        System.out.println("x: "+x +" Y: "+y);
    }
    public NewClass(int x){
        this(x,6);
        System.out.println("1 Argument Constuctor"); 
        System.out.println("x: "+x +" Y: "+y);
    }
    public NewClass(int x, int y){
        System.out.println("2 Argument Constuctor");
        this.x=x;
        this.y=y;
    } 
    public NewClass(NewClass obj){
        this.x=obj.x;
        this.y=obj.y;
        System.out.println(" copy Constuctor"); 
        System.out.println("x: "+x +" Y: "+y);
    }
    public String toString(){
        return  String.format("\nprinting obj\nValue of X is %02d and Value of Y is %02d \n",x,y);
    }

}
