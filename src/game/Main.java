package game;

import java.util.Scanner;

import game.Char.hero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************************************************");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ٴ幰�� �ε����� �Ҹ��� �鸰��.");
		System.out.println();
		System.out.println("���� ������ ����� ��� ����� ���� �����ִ�.");
		System.out.println();
		System.out.println("�׸��� �� ���ݰ� �ȴ�. �̰��� ���ε���� ����");
		System.out.println();
		System.out.println("***************** ���ε����� ��Ƴ��� *********************");
		System.out.println();
		System.out.println("����� �̸��� �Է����ּ���");
		String input = sc.nextLine();
		hero.name=input;
		System.out.printf("����� �̸��� %s �Դϴ�.\n",hero.name);
		System.out.println("����� ���� ���׸��� ������ �߰��մϴ�.");
		System.out.println();
		System.out.println("�װ����� ����� �����Ⱑ ���۵˴ϴ�.....");
		System.out.println("***************** ���ε����� ��Ƴ��� *********************");
		Field a = new Field();
		
		a.cave();
	}

}
