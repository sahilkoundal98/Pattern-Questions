
public class HalfPyramidNumbers {
	public static void main(String[] args) {
		
		int n=5; //Rows

		//Outer loop for rows
		for (int i=1;i<=n ;i++ ) {
			
			//Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j+" ");
			}

			//New line
			System.out.println();
		}

	}
}