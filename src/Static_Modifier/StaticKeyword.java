package Static_Modifier;

public class StaticKeyword {
	private int id;
    private String name;
    public static int count; //static variable
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public StaticKeyword(String name){
        this.name=name;
        count++;
        this.id=count;
    }
    public static int getCount(){   //static method
        return count;
    }
    static{                          //static block
        count=1000;
          System.out.println("Initial value of ID:" + count);
    }
    public static void main(String[] args){
        System.out.println("ID before creating object:" + StaticKeyword.getCount());
        StaticKeyword st1= new StaticKeyword("Robert");
        System.out.println("Student ID with getId method:" + st1.getId());
        System.out.println("ID after creating 1st object:" + StaticKeyword.getCount());
        StaticKeyword st2= new StaticKeyword("John");
        System.out.println("Student ID with getId method:" + st2.getId());
        System.out.println("ID after creating 2nd object:" + StaticKeyword.getCount());
    }
}
