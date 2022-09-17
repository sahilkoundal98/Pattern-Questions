
public class HalfPyramid {
	public static void main(String[] args) {
		
		int n=4; //Rows

		//Outer loop for rows
		for(int i=1;i<=n;i++) {

			//Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}