package MethodRef;

import java.util.ArrayList;
import java.util.List;

interface Sayable
{
int say(int a);	
}

class A{
	static final B obj=new B();
	
}
class B{
	
	public void display()
	{
		System.out.println("Class B");
	}
	
}


public class MethodReferenceExample {
   
	
	public static void print()
	{
	
		
	}
	
	
	
	public static void main(String args[])
	{	
		Runnable t=new Thread(()->System.out.println("hello"));
		((Thread) t).start();
	
		List<Integer>l=new ArrayList<>();
		l.add(12);
		l.add(133);
		l.forEach(System.out::println);
		//A.obj::display();
		//Person obj=new Person();
		
		
		//Person s=MethodReferenceExample::print;
		//s.p();
		
	}
}
