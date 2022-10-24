
public class FloydsTriangle {
	public static void main(String[] args) {
		
		int n=5; //Rows
		int number=1;

		//Outer loop for rows
		for (int i=1;i<=n ;i++ ) {
			
			// Inner loop for columns
			for (int j=1;j<=i ;j++ ) {
				System.out.print(number + " ");
				number++;
			}

			//New Line
			System.out.println();
		}
	}
}