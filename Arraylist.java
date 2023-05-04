import java.util.ArrayList;
import java.util.Collections;
public class Arraylist
{
	public static void main(String[] f)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
	       //add
	       list.add(90);
               list.add(7);
	       list.add(5);
	       //get
	       int p=list.get(0);
	       System.out.println("Index 0:"+p);
	       //get ele gives index in arraylist
	       for(int i=0;i<list.size();i++){
		       System.out.print(list.get(i)+"\t"); 
	     }
	     //SET ELE
	     list.set(0,89);
	     System.out.println(list);
		//add ele in b/w 
		 list.add(2,78);
		 System.out.println(list);
		 //sort
		 Collections.sort(list);
		 System.out.println("Sorted List="+list);
		  //size
		  int y=list.size();
		  System.out.println("Size="+y);
	       //delete
	       list.remove(5);
	       System.out.println("REmoved list="+list);
	        
	}
}
