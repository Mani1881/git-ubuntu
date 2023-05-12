//Hashset doesn't allow duplicate items
import java.util.HashSet;
import java.util.Iterator;
public class Hs{
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
         hs.add("manu");
         hs.add("Apple");
         hs.add("pallavi");
        hs.add("lilly");
        hs.add("Nani");
        System.out.println("Hashset is="+hs);
        //hs.contains();
        System.out.println(hs.contains("manu"));
        //hashCode();
        System.out.println("Hashcode val="+hs.hashCode());
/* 
        // Creating a new cloned set
        HashSet cloned_set = new HashSet();
        // Cloning the set using clone() method
        cloned_set = (HashSet)hs.clone();
        // Displaying the new Set after Cloning;
        System.out.println("The new set: " + cloned_set);
*/
        System.out.println(" new Hashset is="+hs.clone());
        //add an iterator to hs.
        Iterator it=hs.iterator();
        //display ele using Iterator
    while(it.hasNext()){
        String s= (String)it.next();
        System.out.println(s);
    }
    //it deletes last item in hashset and called only once
    it.remove();
    System.out.println("after removing last ele in  hashset "+hs);
    hs.remove("manu");
    System.out.println("New hashset "+hs);
    hs.remove(1);//here hs stores string but not integers
    System.out.println("hashset "+hs);
/*equals()
        // Creating an empty AbstractSet
        AbstractSet<String>
            abstract_set1 = new HashSet<String>();
        AbstractSet<String>
            abstract_set2 = new HashSet<String>();
  
        // Adding elements to set
        abstract_set1.add("Geeks");
        abstract_set1.add("4");
        abstract_set1.add("Geeks");
        abstract_set1.add("Welcomes");
        abstract_set1.add("You");
  
        // Adding elements to set
        abstract_set2.add("Geeks");
        abstract_set2.add("4");
        abstract_set2.add("Geeks");
        abstract_set2.add("Welcomes");
        abstract_set2.add("You");
  
        // Displaying the first HashSet
        System.out.println("First Set: "
                           + abstract_set1);
  
        // Displaying the second HashSet
        System.out.println("Second Set: "
                           + abstract_set2);
  
        // Displaying the equality
        System.out.println("Equality: "
                           + abstract_set1
                                 .equals(abstract_set2)); */
//hs.addAll()
/*
 // Java code to illustrate addAll()
// method of AbstractCollection

import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionDemo {
	public static void main(String args[])
	{
		// Creating an empty collection
		AbstractCollection<Integer>
			abs1 = new TreeSet<Integer>();
		// Use add() method to add
		// elements into the Collection
		abs1.add(10);
		abs1.add(20);
		abs1.add(30);
		abs1.add(40);
		abs1.add(50);
		// Displaying the Collection
		System.out.println("AbstractCollection 1: "
						+ abs1);
		// Creating another Collection
		AbstractCollection<Integer>
			abs2 = new TreeSet<Integer>();
		// Displaying the Collection
		System.out.println("AbstractCollection 2: "
						+ abs2);
		// Using addAll() method to Append
		abs2.addAll(abs1);
		// Displaying the Collection
		System.out.println("AbstractCollection 2: "
						+ abs2);
	}
}
 */
//removeall()
/*
 // Java program to demonstrate
// removeAll() method for Integer value

import java.util.*;

public class GFG1 {
	public static void main(String[] args) throws Exception
	{

		try {

			// Creating object of AbstractSet<Integer>
			AbstractSet<Integer>
				abs_set = new TreeSet<Integer>();

			// Populating abs_set
			abs_set.add(1);
			abs_set.add(2);
			abs_set.add(3);
			abs_set.add(4);
			abs_set.add(5);

			// print abs_set
			System.out.println("AbstractSet before "
							+ "removeAll() operation : "
							+ abs_set);

			// Creating another object of ArrayList<Integer>
			Collection<Integer>
				arrlist2 = new ArrayList<Integer>();
			arrlist2.add(1);
			arrlist2.add(2);
			arrlist2.add(3);

			// print arrlist2
			System.out.println("Collection Elements"
							+ " to be removed : "
							+ arrlist2);

			// Removing elements from AbstractSet
			// specified in arrlist2
			// using removeAll() method
			abs_set.removeAll(arrlist2);

			// print arrlist1
			System.out.println("AbstractSet after "
							+ "removeAll() operation : "
							+ abs_set);
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
 */
     // Check for the empty set
     System.out.println("Is the set empty: " + hs.isEmpty());
     // Clearing the set using clear() method
     // Again Checking for the empty set
     System.out.println("Is the set empty: " + hs.isEmpty());
     System.out.println("hashset "+hs);
     System.out.println("clone="+hs.clone());
     /*// Java program to illustrate retainAll() method
import java.util.*;
public class AbstractCollectionDemo {
	public static void main(String[] args)
	{
		// Creating an arraylist
		AbstractCollection<Object> set1
			= new ArrayList<Object>();
		// adding values in set 1 list
		set1.add("one");
		set1.add("two");
		set1.add("three");
		// creating another arraylist
		AbstractCollection<Object> set2
			= new ArrayList<Object>();
		// adding values in set 2 list
		set2.add("three");
		set2.add("one");
		set2.add("five");
		// before invoking retainAll()
		System.out.println("Set 1 contains:\n"
						+ set1 + "\n");
		System.out.println("Set 2 contains:\n"
						+ set2 + "\n");
		// invoking retainAll()
		set2.retainAll(set1);
		// after invoking retainAll()
		System.out.println("Set 2 after"
						+ " invoking retainAll() method:\n"
						+ set2);
	}
}
//*************Exception*************
AbstractCollection<Object> set1 = null;
  
        // creating another arraylist
        AbstractCollection<Object> set2
            = new ArrayList<Object>();
        // adding values in set 2 list
        set2.add("one");
        set2.add("two");
        set2.add("three");
  
        // before invoking retainAll()
        System.out.println("Set 1 contains:"
                           + set1 + "\n");
        System.out.println("Set 2 contains:"
                           + set2 + "\n");
        try {
            // invoking retainAll()
            set2.retainAll(set1);
            // after invoking retainAll()
            System.out.println("Set 2 after invoking "
                               + "retainAll() method:\n"
                               + set2);
        }
        catch (Exception e) {
            System.out.println(e);
        }
*/    
        // Creating the array and using toArray()
       // Object[] arr = hs.toArray();
        // Creating the array and using toArray()
        String[] arr = new String[5];
        arr = hs.toArray(arr);
        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
            /*When array is less than the size of AbstractCollection
            Exception takes place(.NullPointerException)
              // Creating an empty AbstractCollection
        AbstractCollection<String>
            abs_col = new PriorityQueue<String>();
        // Use add() method to add
        // elements into the AbstractCollection
        abs_col.add("Welcome");
        abs_col.add("To");
        abs_col.add("Geeks");
        abs_col.add("For");
        abs_col.add("Geeks");
        // Displaying the AbstractCollection
        System.out.println("The AbstractCollection: "
                           + abs_col);
        try {
            // Creating the array
            String[] arr = null;
            // using toArray()
            // Since arr is null
            // Hence exception will be thrown
            arr = abs_col.toArray(arr);
            // Displaying arr
            System.out.println("The arr[] is:");
            for (int j = 0; j < arr.length; j++)
                System.out.println(arr[j]);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
             */
    //
    //toString()
    System.out.println("toString(): " + hs.toString());
    hs.clear();

        }
}
