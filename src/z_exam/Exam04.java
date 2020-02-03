/*
 * 
	[4-1]
 
		1. x>10 && x<20
		2. ch != ' ' && ch != '\t'
		3. ch == 'x' || ch == 'X'
		4. ch>= '0' && ch<= '9'
		5. (ch>= 'a' && ch<='z') || (ch>= 'A' && ch<='Z')
		6.( year%400==0 || year %4==0 )&& year%100!=0
		7. powerOn == false
		8. str.equals("yes") 
		
		
	[4-2]
		
		int sum = 0;
		for(int i=1; i<=20; i++){
			if(i%2!=0 || i%3 !=0){
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	  
		
	[4-3]
		
		int sum= 0;
		for(int i = 1; i<=10; i++){
			for(int j = 1; j<=i; j++){
				sum += j;
			}
		}
		System.out.println(sum);
		}

		220
		
	[4-4]
			int i = 0;
	int sum=0;;
	
	while(sum<100){
		i++;
		if(i%2==0){
			sum += -i;
		}else
			sum += i;
	}
	
	System.out.println(i);
		
	[4-5]
		int i = 0,j=0;
	
	while(i<=10){
		
		j=0;
		while(j<=i){
			j++;
			System.out.print("*");
		}
		System.out.println();
		i++;
	}

	[4-6]
			for(int i = 1; i<=6; i++){
		for(int j = 1; j<=6; j++){
			if(i+j==6){
				System.out.println(i+","+j);
				
			}
		}
	}
	
	[4-7]
		int values = (int)(Math.random()*6)+1;
		
	[4-8]
		
		for(int x = 0; x<=10; x++){
		for(int y=0; y<=10; y++){
			if((2*x)+(4*y)==10){
				System.out.println(x+","+y);
				
			}
		}
		
	[4-10]
	
		
		int num = 12345;
		int sum = 0;
		int num1=0;
		for(int i = 0; num%10 !=0; i++){
			num1 = num%10;
			num /=  10;
			
			sum += num1;
		}
		
	[4-11]
		num3 = num1 + num2;
		num1= num2;
		num2 = num3;
		System.out.print(","+num3);
		
	[4-14]
		(1)
		(int)(Math.random()*100)+1;
		(2)
		if(input>answer){
			System.out.println("더 작은값 을 입력하세요");
	
		}else if(input < answer){
			System.out.println("더 큰 값을 입력하세요");
		}else{
			System.out.println("정답입니다.");
			System.out.println("시도한 횟수는"+count);
		}
	
	[4-15]
	
	result =result *10 +tmp%10;
		
		tmp /=10;
}
	
	
*/

