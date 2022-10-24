
public class InvertedHalfPyramidNumbers {
	public static void main(String[] args) {
		
		int n=5; //rows

		//Outer loop for rows
		for (int i=n;i>=1 ;i-- ) {
			
			//Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j+" ");
			}

			//New line
			System.out.println();
		}
	}
}