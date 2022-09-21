

public class InvertedRotatedHalfPyramid {
	public static void main(String[] args) {
		
		int n=4; //Rows

		//Outer loop for rows
		for(int i=1;i<=n;i++) {

			//Inner loop for printing Spaces
			for (int j=1;j<=n-i ;j++ ) {
				System.out.print(" ");
			}

			//Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}