package Polymorphisam;

public class MethodOverloading {
	public void add( int a, int b){
        System.out.println("Sum is :" + (a + b));
    }
     
     public void add( float a, float b){
        System.out.println("Sum is :" + (a + b));
    }
    
     public void add( int a, int b, double c){
        System.out.println("Sum is :" + (a + b + c));
    }
    
    public static void main(String[] args){
    	MethodOverloading cal = new MethodOverloading();
        cal.add(5,5);
        cal.add(5.0f,6.0f);
        cal.add(10,20,30d);
    }
}
