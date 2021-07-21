package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main (String[] args)
	{
		Human02 sento = new Human02();
		System.out.println("名前は" + sento.name + "で、年齢は" + sento.age + "です");
	
		Human02 momoko = new Human02("モモコグミ・カンパニー",22);
		System.out.println("名前は" + momoko.name + "で、年齢は" + momoko.age + "です");
	}
}
