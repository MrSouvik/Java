package Constructor;

public class ParameterizedConstructor {
	String data ;
	ParameterizedConstructor(String data){
		this.data = data;
	}
	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor("Souvik"); //Parameterized constructor
		System.out.println(obj.data);
	}
}
