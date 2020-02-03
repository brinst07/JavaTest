package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*9)+1;
		int num2 = (int)(Math.random()*9)+1;
		int num3 = (int)(Math.random()*9)+1;
		//무작위로 수를 받는다.
	
		while(num1==num2 || num2==num3 || num1 ==num3){
			num1 = (int)(Math.random()*9)+1;
			num2 = (int)(Math.random()*9)+1;
			num3 = (int)(Math.random()*9)+1;
		}
		//만약 중복된 숫자가 있으면 다 독립된 숫자를 받을때까지 받는다.
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		
		
		
		int input1 =0,input2=0,input3=0;
		
		int strike=0, ball, out;
		
		
		while(strike!=3){
			strike=0;
			ball =0; 
			out=0;
			System.out.println("숫자를 입력해주세요");
			input = Integer.parseInt(sc.nextLine());
			input3 = input%10; //1의 자리
			
			input2 = (input/10)%10; //10의 자리
			
			input1 = (input/100)%10; //100의 자리
			
			
			//strike
			if(input1==num1){
				strike++;
			}
			if(input2==num2){
				strike++;
			}
			if(input3==num3){
				strike++;
			}
			
			//ball			
			if(input1==num2 || input1 ==num3){
				ball++;
			}
			
			if(input2==num1 || input2==num3){
				ball++;
			}
			
			if(input3==num1 || input3==num2){
				ball++;
			}
			
			//내가원래 했던 코드이지만 더 쉬운방법은
			/*	if(input1!=num1&&input1!=num2&&input1!=num3){
				out++;
			}
			if(input2!=num1&&input2!=num2&&input2!=num3){
				out++;
			}
			if(input3!=num1&&input3!=num2&&input3!=num3){
				out++;
			}*/
			
			out = 3-strike-ball;
			
			System.out.printf("strike: "+strike+", ball : "+ball+", out : "+ out);
			System.out.println();
			
		}
		
		
		
		
		
	}
}
