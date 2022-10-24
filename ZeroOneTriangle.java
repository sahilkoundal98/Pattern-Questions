
public class ZeroOneTriangle {
	public static void main(String[] args) {
		
		int n=5; //Rows

		//Outer loop for rows
		for (int i=1;i<=n ;i++ ) {
			
			//Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				if ((i+j)%2 == 0) {
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}

			//New line
			System.out.println();
		}

	}
}