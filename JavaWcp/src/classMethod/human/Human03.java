package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03()
	{
		this.name = "セントチヒロ・チッチ";
		this.age = 22;
		this.profession = "アーティスト";
	}
	
	public String getProfile()
	{
		return "年齢は" + this.age + "、職業は " + this.profession;
	}
	
    public void greet(String friend)
    {
    	if (friend == null)
    	{
    		System.out.println("BiSHのメンバーです");
    		return;
    	}
    	System.out.println(friend + "さんこんにちは");
    }
}
