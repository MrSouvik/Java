package Arrays;

public class MultiDimentionArray {
	public static void main(String[] args) {
		 // int[][] marks= new int[2][3];
        // int[][] marks= new int[2][];
        int marks[][]={{58,70,67},{48,88,74},{54,94,75}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
	}
}
