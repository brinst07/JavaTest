package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <<비교연산자>>
		 * - < : 크다
		 * - > : 작다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다.
		 */
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 <= 20 - 15;
		System.out.println(b);
		//Ctrl + Space : 자동완성
		
		//float과 double을 비교할때는 형변환에 주의해야한다.
		b = 10.0f == 10.0; // 작은쪽에서 큰쪽으로 자동적으로 형변환이 진행된다.
		System.out.println(b);
		b = 10.1f == 10.1;
		System.out.println(b);//float나 double형은 정확한 값을 표현해주지못하고 근사치를 표현해주는데(정밀도)그때문에 false
		//float 7자리 double 15자리
		
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1);
		
		//double을 float으로 형변환해야 정확하게 비교할수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b);//같은 스트링 리터럴은 같은 주소를 갖는다.String은 참조형
		b= "abc" == new String("abc");//new가 새로운 주소를 만드는 역할을 한다.
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 연산자로 내용을 비교할 수 없다.
		//String의 내용을 비교하기 위해서는 equals()메소드를 사용해야한다.
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		b = !"abc".equals("ABC");
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요
		//1보다 2가 큰가?
		
		boolean c;
		c= 1>2;
		System.out.println("1보다 2가 큰가?"+ c);
		c= 0<=100;
		System.out.println("0은 100보다 작거나 같은가?"+c);
		c= 3.14f != 3.14;
		System.out.println("3.14f와 3.14는 다른가?"+ c);
		c = !"남자".equals("여자");
		System.out.println("남자와 여자는 다른가?" + c);
		}
	
		
		

}
