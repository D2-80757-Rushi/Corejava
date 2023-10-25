
public class Prog04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
	         
				//System.out.print("*");
	         if(i+j>=n) {
	        	//System.out.print("("+i+"+"+j+")");
	        	 System.out.print("* ");
	         }
	         else {
	        	 System.out.print(" ");
	         }
			}
			System.out.println();
		}
			

	}

}
