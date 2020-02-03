package c_statement;

import java.util.Scanner;

public class Baseball1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=0, b=0, c=0;
		int strike=0, ball, out;
		while(a==b || b==c || a==c){
			a = (int)(Math.random()*9)+1;
			b = (int)(Math.random()*9)+1;
			c = (int)(Math.random()*9)+1;
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		while(strike!=3){
			System.out.println("숫자를 입력해주세요");
			int d = Integer.parseInt(sc.nextLine());
			strike =0; 
			ball=0;
			out=0;
			int c1 = d%10;
			int b1 = (d/10)%10;
			int a1 = (d/100)%10;
			
			if(a==a1){
				strike++;
			}
			
			if(b==b1){
				strike++;
				
			}
			
			if(c==c1){
				strike++;
			}
			
			if(a==b1 || a==c1){
				ball++;
			}
			
			if(b==a1 || b==c1){
				ball++;
			}
			
			if(c==a1 || c==b1){
				ball++;
			}
			
			out = 3-strike-ball;
			
			System.out.println("***********************************");
			System.out.println(strike+","+ball+","+out);
			if(strike==3){
				System.out.println("*************3strike***************");
				System.out.println("축하합니당");
			}
		}
		
	}

}