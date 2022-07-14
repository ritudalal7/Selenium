package Collections;
import java.util.LinkedHashSet;
public class LinkedHashSetStudy {
public static void main(String[] args)
{
           LinkedHashSet ls= new LinkedHashSet();
           ls.add("Pune");
           ls.add("Pune");
           ls.add('A');
           ls.add(123);
           ls.add(12.234);
           ls.add(null);
           ls.add(null);
           ls.add(true);
            System.out.println(ls);
// do all methods by our own
//for loop
//for each
//iterator
           for(Object l:ls)
            {
            System.out.println(l);
            }
            LinkedHashSet<Integer> lh1= new LinkedHashSet<>();
            lh1.add(90);
            lh1.add(10);
            lh1.add(80);
            lh1.add(20);
            lh1.add(1);
            System.out.println(lh1);
      }
}

