package extend.human;

public class Employee extends Human {
	private String department;
	
	public Employee(String name, int age, String departmant)
	{
		super(name, age);
		this.department = department;
	}
	
	public String getEmployeeProfile()
	{
		String profile = "年齢は" + super.age + "です。";
		profile += "サラリーマンで、部署は、" + this.department + "です。";
		return profile;
	}

}
