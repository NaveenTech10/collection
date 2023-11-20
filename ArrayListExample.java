package collectionpack;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList list=new ArrayList();//Creating arraylist    
	     
		 list.add("Mango");//Adding object in arraylist    
		 list.add("Apple");    
		 list.add("Banana");    
		 list.add("Grapes"); 
		 
	      //Printing the arraylist object   
		 System.out.println(list); 
		 System.out.println("****************");
	      //     list through Iterator  
		 		Iterator itr=list.iterator();//getting the Iterator  
	     	
		 		while(itr.hasNext()){//check if iterator has the elements  
	      
		 			System.out.println(itr.next());
	      }
	      
	      System.out.println("*****************");
	      System.out.println("AT THE GIVEN POSITION :"+list.get(1));
	      
	      list.set(1, "jackfruit");
	      
	    System.out.println("********************");
	    
	    System.out.println(list);
	    System.out.println("****************");
	    
	    Collections.sort(list);//sorted
	    System.out.println(list);
	    
	    //second list 
	    ArrayList listTwo=new ArrayList(); 
	    
	    	listTwo.add("Sonoo");  
	    	listTwo.add("Hanumat");
	    	//listTwo.add("Mango");
	    	System.out.println(listTwo);
        
	    	list.addAll(listTwo);
	    	System.out.println(list);
        
        ArrayList listThree=new ArrayList();  
        	listThree.add("John");  
        	listThree.add("Rahul");
        	System.out.println(listThree);
        	list.addAll(1, listThree); 
        	System.out.println(list);
        	  //Removing specific element from arraylist  
           list.remove("Sonoo");  //remove(0):index
           System.out.println(list);
           list.clear();
           System.out.println(list);
          System.out.println(list.isEmpty()); 
         
	}
}
