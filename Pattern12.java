/*

5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 

*/

package assiggnment_27_pattern;

public class Pattern12 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		for(int i=row;i>0;i--)
		{
			for(int j=col;j>0;j--)
			{
				System.out.print(j+" ");
			}
			col--;
			System.out.println();
	}
	}

}
