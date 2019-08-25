package evan.main;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> l= new ArrayList();
		l.add("ram");
		l.add("shyam");
		l.add("hari");
		l.remove(0);
		
		for (String name : l) {
			System.out.println(name);
		}
		System.out.println("--------------");
		System.out.println("hashset");
		System.out.println("------------");
		
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Four");  
       for (String string : set) {
		System.out.println(string);
	}
       
       System.out.println("--------------");
		System.out.println("Queue");
		System.out.println("------------");
       //FIFO
       
       Deque<String> queue=new LinkedList();  
       queue.add("ram");
       queue.add("shyam");
       queue.add("hari");
       queue.add("krishna");
       queue.pop();
       queue.pop();
       queue.add("gopal");
       for (String string : queue) {
		System.out.println(string);
	}
       System.out.println("--------------");
		System.out.println("Stack");
		System.out.println("------------");
       
       //stack
      // LIFO
       
       Stack<String> s= new Stack<String>();
       s.push("ram");
       s.push("shyam");
       s.push("hari");
       s.push("gopla");
       s.push("mohan");
       s.push("chris");
       s.pop();
       s.pop();
       s.push("rama");
       for (String string : s) {
   		System.out.println(string);
   	}
       
       System.out.println("--------------");
		System.out.println("Map ");
		System.out.println("------------");
       HashMap<String,String> hm=new HashMap<String,String>();    
       
       hm.put("abc", "ram");
       hm.put("def", "shyam");
       hm.put("ghi", "hari");
       hm.put("klm", "rama");
       
 
	for (Entry<String, String> xyz : hm.entrySet()) 
			
		{
	    System.out.println(xyz.getKey() + " = " + xyz.getValue());
	}
       
       
	}

}
