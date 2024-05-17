package Xplore;

public class TwoDArray {

	public static void main(String[] args) {
		int [][]array = {
				{1,2,3},
				{45,78,89},
				{74,12,45}
		};
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
