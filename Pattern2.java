/* Pattern:
 
  	1 2 3 4
  	1 2 3 4
  	1 2 3 4
  	1 2 3 4
  
  */

package assiggnment_27_pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int row=4;
		int col=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
