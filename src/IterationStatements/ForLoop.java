package IterationStatements;

public class ForLoop {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.print(i+"  ");
		}
		
		//Labeling in for loop
		
		int i,j;
		
		Loop1: for(i=1;i<=10;i++) {
				System.out.println();
				
		Loop2: for(j=1;j<=10;j++) {
					System.out.println(j+"");
				    if(j==5)
					   break Loop1;
				}
		}
	}
}
