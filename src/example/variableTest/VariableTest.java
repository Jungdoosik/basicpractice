package example.variableTest;

import java.util.Scanner;

public class VariableTest {
	private static final double PI = 0;

	public void method1() {
		
		int inum;
		double dnum;
		char ch;
		String str;
		boolean b;
		
		inum = 100;
		dnum = 234.567;
		ch = 'A';
		str = "Hello world";
		b = true;
		System.out.println("===== 변경 전 =====");
		
		System.out.println("int는 : " + inum);
		System.out.println("double은 : " + dnum);
		System.out.println("char는 : " + ch);
		System.out.println("String은 : " + str);
		System.out.println("boolean은 : " + b);
		
		
		System.out.println("===== 변경 후 =====");
		
		inum = 10000;
		dnum = 567.123456789;
		ch = 'B';
		str = "Welcome to Java";
		b = false;
		
		System.out.println("int는 : " + inum);
		System.out.println("double은 : " + dnum);
		System.out.println("char는 : " + ch);
		System.out.println("String은 : " + str);
		System.out.println("boolean은 : " + b);
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력 : ");
		int inum = sc.nextInt();
		
		double pi = 3.14;
		
		//System.out.println("반지름이 " + inum + "인 원의 둘레 : " + 2 * inum * pi);
		//System.out.println("반지름이 " + inum + "인 원의 면적 : " + inum * inum * pi);
		
		//소수점 아래 한자리까지
		System.out.printf("반지름이 %d인 원의 둘레 : %.1f\n", inum, 2*inum*pi);
		System.out.printf("반지름이 %d인 원의 면적 : %.1f\n", inum, inum*inum*pi);
	}

}
