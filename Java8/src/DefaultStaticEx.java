interface A{
	
	static void m(){
		System.out.println("A interface");
	}
}
interface B{
	
	static void m(){
		System.out.println("B interface");
	}
}
public class DefaultStaticEx implements A,B{
	
	 void m(){
	System.out.println("Not ");	
	}
	 

 

}
