package game;

import game.Char.pig;

public class Char {
	
//캐릭터의 스텟화
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
	

	
	
	//캐릭터의 정보를 알려주는 메소드
	void info(){
		System.out.println("*******************************");
		System.out.printf("*이름\t:\t%s\n",hero.name);
		System.out.printf("*레벨\t:\t%s\n",hero.level);
		System.out.printf("*체력\t:\t%s\n",hero.hp);
		System.out.printf("*공격력\t:\t%s\n",hero.str);
		System.out.printf("*배고픔\t:\t%s\n",hero.hunger);
		System.out.printf("*졸림\t:\t%s\n",hero.sleep);
		System.out.printf("*고기\t:\t%s\n",hero.meat);
		System.out.println("*******************************");
	}
	
	

}
