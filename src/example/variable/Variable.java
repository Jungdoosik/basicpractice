package example.variable;

import java.util.Scanner;

public class Variable {
	public void intVariable() {
		
	
	//변수 선언과 동시에 초기화
	
	//논리형 /1byte
	//2단어 이상의 변수명 : 낙타등 표기법
	 boolean isTrue = true;
	 boolean isFalse = false;
	 
	 //문자 :2byte
	 char ch = 'a';
	 
	 //문자열 : 참조형(주소값 저장)
	 String str = "안녕하세요";
	 
	 //숫자형
	 //정수
	 byte bnum = 1;
	 short snum = 2;
	 int inum = 4;
	 long lnum = 8L;
	 
	 //실수
	 float fnum = 4.0f;
	 double dnum = 8.0;
	 
	 //변수에 저장된 값 출력하기
	 System.out.println("isTrue의 값 : " + isTrue);
	 System.out.println("isFalse의 값 : " + isFalse);
	 System.out.println("ch의 값 : " + ch);
	 System.out.println("str의 값 : " + str);
	 System.out.println("byte의 값 : " + bnum);
	 System.out.println("int의 값 : " + inum);
	 System.out.println("short의 값 : " + snum);
	 System.out.println("long의 값 : " + lnum);
	 System.out.println("float의 값 : " + fnum);
	 System.out.println("double의 값 : " + dnum);
	 
	} 
	public void changValue() {
		//변수값 변경 테스트
		String name;
		char gender;
		int age;
		double height;
		
		name = "김영희";
		gender = 'F';
		age = 20;
		height = 171.5;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//키보드로 값을 입력받아 변수에 저장된 값 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력하시오 : ");
		gender = sc.next().charAt(0);
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하시오 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
	}
}

