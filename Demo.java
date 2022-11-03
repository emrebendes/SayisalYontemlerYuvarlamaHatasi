package ders3;

public class Demo {

	public static void main(String[] args) {
		float f= 0.00001f,f2=0.00000999999974737875163555145263671875f;
		float f3 =100_000_000_001f , f4= 100_000_000_000f;		
		
		//double d3 = 10_000_000_001 , d4= 10_000_000_000;
		
		if (f==f2)
			System.out.println("bbbbb");		
	
	
		float t=0;
		
		for (int i = 0; i <= 100000; i ++) 
		{
			t+=f;
		}
		System.out.println(t);
	}
}
