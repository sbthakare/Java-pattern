/* 
    1
   23
  345
 4567
56789

*/
package assiggnment_27_pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		int space=4;
		int a=1;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<space;k++)
			System.out.print(" ");
			for(int j=0;j<col;j++)
			{
				System.out.print((a+i+j)+"");
			
			}
			space--;
			col++;
			System.out.println();
		}


	}

}
