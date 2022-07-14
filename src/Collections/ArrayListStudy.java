package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> a=new ArrayList<>();
		
		a.add("Velocity");
		a.add('A');
		a.add(123);
		a.add(true);
		a.add(123.123);
		a.add("Velocity");
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(12));
		System.out.println(a.contains(123));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Velocity"));
		System.out.println(a.remove(1));
		System.out.println(a);
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
        System.out.println("===============");
        
        Iterator it = a.iterator();//it moves forward

        		while(it.hasNext())
        		{
        			System.out.println(it.next());
        		}
        		
                System.out.println("====...........======");
                
                ListIterator ltr=a.listIterator(); //it goes forward as well as backward
                while(ltr.hasNext())
                {
                	System.out.println(ltr.next());
                }
                
                System.out.println("########");
                
                for(Object v:a)//for each loop
                {
                	System.out.println("v");
                }
                
                ArrayList<Integer>ai=new ArrayList<>();     
                
                ai.add(12);
        		ai.add(10);
        		ai.add(8);
        		ai.add(6);
        		ai.add(4);
        		
        		System.out.println(ai);
        		
        		for (Integer s:ai)
        		{
        			System.out.println(s);
        		}

           ArrayList<Character>as=new ArrayList<>();     
                
                as.add('A');
        		as.add('B');
        		as.add('C');
        		as.add('D');
        		as.add('E');
        		
        		System.out.println(as);
        		for(Character d:as)
        		{
        			System.out.println(d);
        		}
        		
        		
                
		}
	
      


	}

