

public class SolidRectangle {
	public static void main(String[] args) {
		
		int n=4;
		int m=5;

		//Outer loop for printing rows, where n=4
		for(int i=1;i<=n;i++) {

			//Inner loop for printing columns, where m=5
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}

			//Printing next line 
			System.out.println();
		}
	}
}