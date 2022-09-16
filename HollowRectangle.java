
public class HollowRectangle {
	public static void main(String[] args) {
		
		int n=4; //rows
		int m=5; //columns

		//outer loop for rows
		for(int i=1;i<=n;i++) {

			//Inner loop for columns
			for(int j=1;j<=m;j++) {
				
				if( i==1 || i==n || j==1 || j==m ) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}

			}

			// Next line 
			System.out.println();
		}
	}
}