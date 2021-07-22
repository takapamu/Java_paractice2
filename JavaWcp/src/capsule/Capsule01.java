package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNOCapsile;

public class Capsule01 {
	public static void main(String[] args)
	{
		HumanNOCapsile human1 = new HumanNOCapsile("セントチヒロ・チッチ", 22);
		human1.name = "モモコグミ・カンパニー";
		human1.age = 22;
		System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");
		
		HumanCapsule human2 = new HumanCapsule("アユニ・D",22);
		System.out.println("名前は" +human2.getName()+ ", 年齢は" + human2.getAge() + "です。");
		
		human2.setName("アイナ・ジ・エンド");
		System.out.println("変更した名前は" +human2.getName()+ "です。");
		
		
	}

}
