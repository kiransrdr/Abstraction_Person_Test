 



package staticmethod;




public class StaticMethod {
    private int a;
    private static int b;
    
    //Two argument constructor
    public StaticMethod(int a,int b){
       this.a=a;
       this.b=b;
    }
    
    //No argument constructor
    public StaticMethod(){
      this.a=0;
      this.b=0;
       
      }
    public StaticMethod(StaticMethod obj){
        this.a=obj.a;
        this.b=b;
       
      } 
    public void setA(int value){
        a=value;
    }
    public static void setB(int value){
        b=value;
       
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }

    public static void main(String[] args) {
    
    StaticMethod obj1=new StaticMethod();
    StaticMethod obj2 =new StaticMethod();
    
    System.out.printf("Object1: variable A=%d and Static variable B=%d",obj1.a,obj1.b);
    System.out.println("");
    System.out.printf("Object2: variable A=%d and Static variable B=%d",obj2.a,obj2.b);
     //Setting the value of object 1 and 2
    System.out.println("");
    obj1.setA(5);
    obj1.setB(10);
    obj2.setA(15);
    System.out.println("After setting values");
    System.out.printf("Object1: A=%d and  B=%d",obj1.a,obj1.b);
    System.out.println("");
    System.out.printf("Object2: A=%d and  B=%d",obj2.a,obj2.b);
    StaticMethod.setB(20);
    System.out.println("");
    System.out.printf("Object2: A=%d and  B=%d",obj2.a,obj2.b);
    System.out.println("");
    System.out.printf("Object1: B=%d and  B=%d",obj1.a,obj1.b);
     
    
    StaticMethod obj3 =new StaticMethod(obj2);
    System.out.printf("\nObject3: variable A=%d and Static variable B=%d",obj3.a,obj3.b);
   
    StaticMethod obj4 =new StaticMethod(obj2.a,obj2.b);
    System.out.printf("\nObject4: variable A=%d and Static variable B=%d",obj4.a,obj4.b);
    }
    
}
