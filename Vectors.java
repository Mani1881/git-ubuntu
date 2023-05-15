//vectors are synchronized(here multiple threads are occured)
//The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
import java.util.*;
//import java.util.ListIterator;
public class Vectors {
    public static void main(String[] args) {
        Vector<String>v=new Vector<>();
        //add()
        v.add("manu");
        v.add("Apple");
        v.add("pallavi");
       v.add("lilly");
       v.add("Nani");
       System.out.println("vector="+v);
       //void add(int index, Object element)
       v.add(1,"vani");
       System.out.println("vector="+v);
       //clone
       System.out.println("vector clone="+v.clone());
       //addAll()-->
                // A collection is created
        Collection<String> c = new ArrayList<String>();
        c.add("A");
        c.add("Computer");
        c.add("Portal");
        c.add("for");
        c.add("Geeks");
        v.addAll(c);
        //remove()
        v.removeElement(6);
      //  v.remove(1);
      //  v.remove("manu");
        //set()
        v.set(3, "banana");
        v.set(5,"bunty");
        System.out.println("vector="+v);
        //containsAll()
 System.out.println(v.containsAll(c));
 //capacity(),size()
 System.out.println("vector capacity="+v.capacity());
 System.out.println("vector size ="+v.size());
 //contains()
 System.out.println("Does the vector contains 'Geeks'? "  + v.contains("Geeks"));
         //Get an element at the specified index  
         System.out.println("Element at index 5 is = "+v.elementAt(5)); 
         String[] str = new String[v.size()];       
         //copy elements of vector into an array  
         v.copyInto(str);    
         System.out.println("Elements in str are: ");  
         for(String num : str) 
             System.out.println(num); 
      //elements() method of Vector class in Java is used to get the enumeration of the values present in the Vector. Syntax:Enumeration enu = Vector.elements()
        // Creating an empty enumeration to store
        Enumeration enu = v.elements();
        System.out.println("The enumeration of values are:");
        // Displaying the Enumeration
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
        System.out.println(v.size()); 
     /*    v.ensureCapacity(1);---->>>>>>>not understod
        System.out.println("after ensurecapacity="+v.size());  */
        //equals
        System.out.println("if v==c: "+v.equals(c)); 
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        //get()-->index ele
        System.out.println(v.get(8));
        // forEach method of Vector and
        // print data
        v.forEach((n) -> System.out.println(n));
        /* 
        // create an Vector which going to
        // contains a collection of objects
        Vector<DataClass> vector = new Vector<DataClass>();
        // Add objects to vector
        vector.add(new DataClass("Shape", "Square"));
        vector.add(new DataClass("Area", "2433Sqft"));
        vector.add(new DataClass("Radius", "25m"));
        // print result
        System.out.println("list of Objects:");
        // forEach method of Vector and
        // print Objects
        vector.forEach((n) -> print(n));
        }
    // printing object data
    public static void print(DataClass n)
    {
        System.out.println("****************");
        System.out.println("Object Details");
        System.out.println("key : " + n.key);
        System.out.println("value : " + n.value);
    }
// create a class
class DataClass {
    public String key;
    public String value;
    DataClass(String key, String value)
    {
        this.key = key;
        this.value = value;
    }
         */
        //hashcode()
        System.out.println(v.hashCode());
        //indexOf()
        System.out.println(v.indexOf("A"));
       // Inserting element at 3rd position
        // Custom specified
        v.insertElementAt("Hello", 2); 
        System.out.println(v);
        System.out.println(v.isEmpty());
        //iterator
       ListIterator  it=v.listIterator();
        while(it.hasNext()){
            //forward direction strings
            System.out.println(it.next());
        }
        // Backward iterations
        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println(v);
// The last position of an element is returned
        System.out.println("Last occurrence of Geeks is at index: " + v.lastIndexOf("Geeks"));
        System.out.println("Last occurrence of 10 is at index: " + v.lastIndexOf("10"));
        // Creating an empty Vector
        Vector<String> colvec_tor = new Vector<String>();
        // Use add() method to add elements in the Vector
        colvec_tor.add("Geeks");
        colvec_tor.add("for");
        colvec_tor.add("Geeks");
        // Remove the head using remove()
        //v.removeAll(colvec_tor);
        System.out.println("Calling retainAll() method");
        // calling retainAll()
        v.retainAll(colvec_tor);
        System.out.println("New Vector="+v);
        // apply removeIf() method
        // to remove names contains 4 chars
    v.removeIf(n -> (n.length() == 4));
        System.out.println("Students name do not contain 4 char are");
        // print list
        for (String s : v) {
            System.out.println(s);
        }
        //removerange();
         //replace all vector element "2" with "20"  
         Collections.replaceAll(v, "A", "20");
     System.out.println(v);    
Collections.sort(v);//Sorting an ArrayList in ascending order
System.out.println(" ASC VEC"+v.toString());//toString()
Collections.sort(v,Collections.reverseOrder());//descending order
System.out.println(" DES VEC"+v);
// Setting new custom size
v.setSize(8);
System.out.println("new size"+v.size());
        // create Spliterator of ArrayList
        // using spliterator() method
        Spliterator<String> emails = v.spliterator();
        // print result from Spliterator
        System.out.println("list of Strings:");
        // forEachRemaining method of Spliterator
        emails.forEachRemaining(
            (n) -> System.out.println(n)); 
            //subList
            System.out.println(v.subList(1, 4));
              // Creating the array and using toArray()
        //Object[] arr = v.toArray();or another method
        String[] ar = new String[5];
        ar = v.toArray(ar);
        System.out.println("The array is:");
        for (int j = 0; j < ar.length; j++)
            System.out.println(ar[j]);
            System.out.println(v.size());
            v.trimToSize();
            System.out.println("Original size"+v.size()); 
    }
}
