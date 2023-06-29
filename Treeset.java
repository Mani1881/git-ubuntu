//TreeSet is not synchronized.. Therefore operations like add, remove, and search takes O(log(N)) time.
//The reason is that in a self-balancing tree, it is made sure that the height of the tree is always O(log(N)) for all the operations. 
//operations like printing N elements in the sorted order take O(N) time.
//TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage. 
//The TreeSet implements a NavigableSet interface by inheriting AbstractSet class.
//An object is said to be comparable if and only if the corresponding class implements a Comparable interface.
//String, StringBuffer class and all the Wrapper classes already implements Comparable interface 
//Hence, we DO NOT get a ClassCastException. But if we are creating TreeSet of user defined classes or any Java classes which does not implements comparable interface we will get ClassCastException. to solve this problem we can either implement Comparable to our user defined class or we can pass Comparator object in Constructor while creating the set.
//TreeSet implements SortedSet so it has the availability of all methods in Collection, Set, and SortedSet interfaces. 

import java.io.*;
import java.util.*;
class Treeset {
    public static void main(String[] args) throws IOException {
        TreeSet<String> ts = new TreeSet<String>();
        //add() method
        ts.add("manu");
        ts.add("rajesh");
        ts.add("anand");
        System.out.println(ts);//print sorted order
        //addAll()
        TreeSet<String>n=new TreeSet<>();//here datatype must be String only
        n.add("1");
        n.add("anu");
        ts.addAll(n);
        System.out.println(ts);
        //ceiling()-->>return the least element in this set greater than or equal to the given element, or null if there is no such element.
      String h= ts.ceiling("bunny");
      System.out.println("ceiling str="+h);
      //clone()
      System.out.println("Clone="+ts);
      //contain(object o)
      // Check if the list contains "No"
        System.out.println("Does the Set contains 'No'? "+ ts.contains("No"));
   // using descendingSet() method
         //   NavigableSet<String>treereverse= ts.descendingSet();
            // getting iterated view of NavigableSet
           // Iterator<String> iterator = treereverse.iterator();

           // using descendingIterator() method
            Iterator<String> iterator = ts.descendingIterator();
            System.out.println("\nValues using DescendingSet:");
            // printing the integrated value
            while (iterator.hasNext()) {
                System.out.println("Value : " + iterator.next());
            }
            System.out.println("size="+ts.size());//size() method
            System.out.println("The first element is: " + ts.first());//first()-->return first string
            System.out.println("The last element is:" + ts.last());//last()
 //floor()--->return the greatest element in this set less than or equal to the given element, or null if there is no such element.
          String o= ts.floor("jenny");
        System.out.println("floor str="+o);
        // Creating the headSet tree
        TreeSet<String> head_set = new TreeSet<String>();
        // Limiting the values till 5
        head_set = (TreeSet<String>)ts.headSet("manu");
        // Creating an Iterator
        Iterator  iterate = head_set.iterator();
        // Displaying the tree set data
        System.out.println("The resultant values till head set: ");
        // Iterating through the headSet
        while (iterate.hasNext()) {
            // Printing elements using next() method
            System.out.println(iterate.next() + " ");
        }
//higher()-->return the least element in this set which is strictly greater than the given element ele. 
System.out.println("Higher="+ts.higher("sunny"));
//The lower(E ele) method of TreeSet class in Java is used to return the greatest element in this set which is strictly less than the given element. 
System.out.println("lower="+ts.lower("manu"));
//pollFirst() method of TreeSet in Java is used to retrieves and removes the first (lowest) element, or returns null if this TreeSet is empty.
        // first element is removed
        System.out.println("First lowest element " +  "removed is : " + ts.pollFirst());
        System.out.println("After removing element" +   " from TreeSet: " + ts);
 System.out.println("last lowest element " +  "removed is : " + ts.pollLast());
        System.out.println("After removing element" +   " from TreeSet: " + ts);
System.out.println(ts.remove("anu"));//remove()
System.out.println("after remove"+ts);
        // Creating the tailSet tree
        TreeSet<String> tail_set = new TreeSet<String>();
        // Limiting the values till 5
        tail_set = (TreeSet<String>)ts.tailSet("To");
        // Creating an Iterator
        Iterator   iter= tail_set.iterator();
  
        // Displaying the tree set data
        System.out.println("The resultant values from the tail: ");
  
        // Iterating through the tailSet
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
        }
    
