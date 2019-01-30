package predicate_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;



public class PredicateEx {
	//line of code
	//not reusable
	
	public static List<Employee> getEmp(List<Employee>li,Predicate<Employee>p)
	{	
		/*List<Employee>li2=new ArrayList<Employee>();
		for(Employee e:li)
		{
			if(p.test(e))
			{
				li2.add(e);
			}
		}*/
		return li.stream().filter(p).collect(Collectors.toList());
	}
	
	static boolean method(int a)
	{
		if(a%2==0)
		return false;
		
		return true;
	}
	
	public static void main(String args[])
	{
		List<Employee>li=new ArrayList<>();
		li.add(new Employee("zshika",12,23400));
		li.add(new Employee("Suraj",42,89400));
		li.add(new Employee("Karan",52,45400));
		li.add(new Employee("vidit",62,13400));
	
		Map<String,Integer>m=li.stream().collect(Collectors.toMap(e1->e1.getName(), e2->e2.getSalary()));
		System.out.println(m);
		
		/*double sum=li.stream().map(e->e.getSalary()).collect(Collectors.averagingInt(e->e));
		System.out.println(sum);
		*/
		
		//li.forEach(System.out::println);
		
		//li.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		/*li.stream().forEach(i->{ 
			if(i.getName()=="Eshika")
				System.out.println(i.getName().startsWith("K"));
		});*/
		
		//List<Integer>li2=li.stream().map(e->e.getAge()).collect(Collectors.toList());
	/*
		Stream<String>st=Stream.generate(()->{return "Hi";}).limit(4);
		st.forEach(System.out::println);
	*/
		//Stream.iterate(1,n->n*2+1).filter(PredicateEx::method).limit(10).forEach(System.out::println);
		//st.forEachOrdered(System.out::println);
		//again starting thread exception
		//li2=li.stream().mapToDouble(e->e.getSalary()).collect(Collectors.summingDouble());
		//List<Employee>li2=getEmp(li,t->t.getAge()>25);
		//li2.forEach(System.out::println);
		
	}
	

}
