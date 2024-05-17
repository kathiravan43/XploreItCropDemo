package Xplore;

public class Nested_for {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(" i loop count :"+i);
			for(int j=1;j<=i;j++)
			{
				System.out.println("j loop count is :"+j);
			}
		}

	}

}
