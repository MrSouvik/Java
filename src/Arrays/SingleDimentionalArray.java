package Arrays;

public class SingleDimentionalArray {
	public static void main(String[] args) {
		int[] ids = new int[3]; // primitive type array
	    int count = 1;
	    ids[0] = 1001;
	    ids[1] = 1002;
	    ids[2] = 1003;
	   
	    for(int i = 0; i < ids.length; ++i) {   // traversing an array
	      System.out.println("ID " + count + ": " + ids[i]);
	      ++count;
	    }
	}
}
