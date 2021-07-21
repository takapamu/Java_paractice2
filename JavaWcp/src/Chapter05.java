
public class Chapter05 {
	public static void main(String[] args)
	{
		long long1 = 9223372036854775807L;
		System.out.println(long1);
		
		double double1 = 1234567.89;
		System.out.println(double1);
		
		boolean boolean1 = true;
		System.out.println(boolean1);
		
		Float f = Float.valueOf(3.14f);
		System.out.println(f);
		
		Integer i = Integer.valueOf(19);
		int val = i.intValue();
		System.out.println(val);
		
		Character cc = new Character('う');
		System.out.println(cc);
		
		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		
		int int2 = array1[2];
		System.out.println(int2);
		
	}

}
