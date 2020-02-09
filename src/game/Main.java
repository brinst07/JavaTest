package game;

import java.util.Scanner;

import game.Char.hero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************************************************");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("바닷물이 부딪히는 소리가 들린다.");
		System.out.println();
		System.out.println("눈을 떠보니 당신은 어느 백사장 위에 누워있다.");
		System.out.println();
		System.out.println("그리고 곧 깨닫게 된다. 이곳은 무인도라는 것을");
		System.out.println();
		System.out.println("***************** 무인도에서 살아남기 *********************");
		System.out.println();
		System.out.println("당신의 이름을 입력해주세요");
		String input = sc.nextLine();
		hero.name=input;
		System.out.printf("당신의 이름은 %s 입니다.\n",hero.name);
		System.out.println("당신은 아주 조그마한 동굴을 발견합니다.");
		System.out.println();
		System.out.println("그곳에서 당신의 생존기가 시작됩니다.....");
		System.out.println("***************** 무인도에서 살아남기 *********************");
		Field a = new Field();
		
		a.cave();
	}

}
