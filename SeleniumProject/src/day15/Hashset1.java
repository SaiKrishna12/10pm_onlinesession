package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashset1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*List<String> l=new ArrayList<>();
		l.add("selenium");
		l.add("qtp");
		l.add("selenium");
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		Set<String> s=new HashSet<>();
		s.add("selenium");
		s.add("qtp");
		s.add("lr");
		s.add("jmeter");
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
