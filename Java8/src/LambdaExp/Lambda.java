package LambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*class Person implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>5;
	}} */
public class Lambda {
	
	public static void getList(List<Integer>li,Predicate<Integer>p)
	{
		for(Integer i:li)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]){
	List<Integer>list=Arrays.asList(1,2,3,4,5,6);
	//getList(list,new Person());
	getList(list,x->x<5);
	}

}
