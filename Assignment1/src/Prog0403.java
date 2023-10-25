
public class Prog0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<=n;i++) {
			for(int k=n;k>=(i+1);k--) {
				System.out.print(" ");
			}
				
			for(int j=0;j<(2*(i+1)-1);j++) {
	        	 System.out.print("*");
			}
			System.out.println(" ");
			
			
		}
		for(int i=n;i>=0;i--) {
			for(int k=(i+1);k<=n;k++) {
				System.out.print(" ");
			}
				
			for(int j=(2*(i+1)-1);j>0;j--) {
	        	 System.out.print("*");
			}
			System.out.println(" ");
			
			
		}

	}

}
