import java.util.*;  
public class ArrayList{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();
  list.add("Mango");   
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  Iterator itr=list.iterator();
  while(itr.hasNext()){  
   System.out.println(itr.next());
  }  
    for(String fruit:list)    
    System.out.println(fruit); 

    System.out.println("Returning element: "+list.get(1));
    al.set(1,"Dates");
    Collections.sort(list); 

   System.out.println("Traversing list through forEach() method:");
        list.forEach(System.out::println);

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(System.out::println);
 }
}
