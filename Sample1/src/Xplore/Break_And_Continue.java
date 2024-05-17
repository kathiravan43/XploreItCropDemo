package Xplore;

public class Break_And_Continue {

	public static void main(String[] args) {
		int i=0;
		/*for(i=1;i<=10;i++) {
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}*/
		for(i=1;i<=10;i++) {
			if(i==7 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
