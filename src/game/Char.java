package game;

import game.Char.pig;

public class Char {
	
//ĳ������ ����ȭ
	static  class hero{
	static String name;
	static int level = 1;
	static int hp=50;
	static int str=level*10;
	static int hunger=50;
	static int sleep=50;
	static int meat = 0;
	
	}
	
	
	
	static class pig{
		static int level = (int)(Math.random()*4)+1;
		static int hp = (int)(Math.random()*60)+20;
	}
	

	
	
	//ĳ������ ������ �˷��ִ� �޼ҵ�
	void info(){
		System.out.println("*******************************");
		System.out.printf("*�̸�\t:\t%s\n",hero.name);
		System.out.printf("*����\t:\t%s\n",hero.level);
		System.out.printf("*ü��\t:\t%s\n",hero.hp);
		System.out.printf("*���ݷ�\t:\t%s\n",hero.str);
		System.out.printf("*�����\t:\t%s\n",hero.hunger);
		System.out.printf("*����\t:\t%s\n",hero.sleep);
		System.out.printf("*���\t:\t%s\n",hero.meat);
		System.out.println("*******************************");
	}
	
	

}
