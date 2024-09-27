package assiggnment_27_pattern;

public class Pattern16 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println();
		}

	}

}
