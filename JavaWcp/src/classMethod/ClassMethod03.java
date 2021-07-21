package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main (String[] args)
	{
		Human03 sento = new Human03();
		
		System.out.println("私の名前は" + sento.name + "です。");
		String profile = sento.getProfile();
		System.out.println(profile + "です。");
		
		sento.greet("モモコ");
		sento.greet(null);
	}
}
