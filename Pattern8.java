
/*
   Pattern:
            1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5
 
 */

package assiggnment_27_pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(j+" ");
			
			}
			col++;
			System.out.println();
		}


	}

}
