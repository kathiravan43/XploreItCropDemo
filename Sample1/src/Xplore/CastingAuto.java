/*
 * Notes : knowing about the type casting which is done by automatically
 * Date  : 17/04/2024
 */
package Xplore;

public class CastingAuto {

	public static void main(String[] args) {
		/* for automatic conversion */
		int a = 89;
		double D = a;
		System.out.println("automatic conversion = " + D);

		/* for manual conversion */

		float f = 187.4896f;
		int A = (int) f;
		System.out.println("manual conversion = " + A);
	}

}
