package Polymorphisam;

public class ConstructorOverloading {
	 int id;
	    String name;
	    ConstructorOverloading(){
	        this.id = 12;
	        this.name = "Jack";
	    }
	    
	    ConstructorOverloading(int id){
	        this.id = id;
	        this.name = "Alice";
	    }
	    
	    ConstructorOverloading(int id , String name){
	        this.id = id;
	        this.name = name;
	    }
	    
	    public static void main(String[] args){
	    	ConstructorOverloading s = new ConstructorOverloading();
	        System.out.println("Student s : ID -" + s.id + " Name - " + s.name);
	        ConstructorOverloading s1 = new ConstructorOverloading(13);
	        System.out.println("Student s1 : ID -" + s1.id + " Name - " + s1.name);
	        ConstructorOverloading s2 = new ConstructorOverloading(14,"Abhi");
	        System.out.println("Student s2 : ID -" + s2.id + " Name - " + s2.name);
	    }
}
