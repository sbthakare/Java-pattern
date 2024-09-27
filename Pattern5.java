
/* Pattern:

	0 1 0 1 
	1 0 1 0 
	0 1 0 1 
    1 0 1 0 
*/

package assiggnment_27_pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int row=4;
		int col=4;
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}

	}

}
