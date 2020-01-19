package scratch.BMI_Calc;

import java.util.Scanner;

public class BMI_Calc {

	public static void main(String[] args) {

		//키 입력값 추출
		System.out.println("너의 키가 몇 cm니?");
		Scanner scanner1 = new Scanner(System.in);
		double height = scanner1.nextDouble();
		System.out.println("키 : " + height + "cm");
		
		//몸무게 입력값 추출
		System.out.println("너의 몸무게가 몇 kg니?");
		Scanner scanner2 = new Scanner(System.in);
		double weight = scanner2.nextDouble();
		System.out.println("몸무게 : " + weight + "kg");
		
		//BMI 계산 및 값 출력
		double bmi = weight / ((height / 100) * (height / 100));
		double BMI = (Math.round(bmi*100) / 100);
		System.out.println("너의 BMI는 " + BMI + " 이란다");
	}

}
