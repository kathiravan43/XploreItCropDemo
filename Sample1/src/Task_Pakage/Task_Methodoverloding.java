package Task_Pakage;

class Process{
	public int doTheProcess(int a, int b) {
				return a+b;
			}
public float doTheProcess(float a, float b) {
				return a/b;
			}
public double doTheProcess(int a, double b) {
		return a*b;
	}
public float doTheProcess(int a, float b) {
		return a-b;
	}
	}
public class Task_Methodoverloding {

	public static void main(String[] args) {
		Process process = new Process();
		System.out.println(process.doTheProcess(45, 45));
	//	System.out.println(process.doTheProcess(89.0, 3.0));
		System.out.println(process.doTheProcess(80, 2));
		System.out.println(process.doTheProcess(75, 2));
			}
}
