package collectionpack;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList list=new LinkedList();//Creating LinkedList    
	     
		 list.add("Naveen");//Adding object in LinkedList    
		 list.add("Thilip");    
		 list.add("Pope");    
		 list.add("Siva"); 
		 
	      //Printing the LinkedList object   
		 System.out.println(list); 
		 System.out.println("****************");
	      //     list through Iterator  
		 		Iterator itr=list.iterator();//getting the Iterator  
	     	
		 		while(itr.hasNext()){//check if iterator has the elements  
	      
		 			System.out.println(itr.next());
	      }
	      
	      System.out.println("*****************");
	      System.out.println("AT THE GIVEN POSITION :"+list.get(1));
	      
	      list.set(1, "Poovarasan");
	      
	    System.out.println("********************");
	    
	    System.out.println(list);
	    System.out.println("****************");
	    
	    Collections.sort(list);//sorted
	    System.out.println(list);
	    
	    //second list 
	    LinkedList listTwo=new LinkedList(); 
	    
	    	listTwo.add("Gopi");  
	    	listTwo.add("Deena");
	    	
	    	System.out.println(listTwo);
       
	    	list.addAll(listTwo);
	    	System.out.println(list);
       
       LinkedList listThree=new LinkedList();  
       	listThree.add("Aravind");  
       	listThree.add("Rasith");
     	listThree.add("CS.Arun");
       	System.out.println(listThree);
       	list.addAll(1, listThree); 
       	System.out.println(list);
       	  //Removing specific element from LinkedList  
          list.remove("Aravind");  //remove(0):index
          System.out.println(list);
          list.clear();
          System.out.println(list);
         System.out.println(list.isEmpty()); 
        
	}

	}

