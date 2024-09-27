/* Pttern
		A B C D 
		B C D E 
		C D E F 
		D E F G 

*/

package assiggnment_27_pattern;

public class Pattern4 {

	public static void main(String[] args) {
		
		int row=4;
		int col=4;
		char a='A';
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print((char)(a+i+j)+" ");
			}
			System.out.println();
		}

	}

}
