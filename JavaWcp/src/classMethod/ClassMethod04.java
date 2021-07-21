package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args)
	{
		Human04 sento = new Human04("セントチヒロ・チッチ");
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
		sento.instanceMethodPrint();
		
	}

}
