
public class Test {
	
	static int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj=new Test();
		Test obj1=new Test();
		
		obj.a=100;
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		obj1.a=200;
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		
		

	}

}
