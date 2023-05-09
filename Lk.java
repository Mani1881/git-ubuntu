//linked list --collections in java
//lk implementation is not synchronised 
import java.io.*;
import java.util.*;
public class Lk {
    public static void main(String[] args) throws IOException{
        //create an empty lk to store Strings
        LinkedList <String> lk=new LinkedList<>();
        lk.add("manu");
        lk.add("Kunal") ;
        lk.add("90");
        lk.add(1,"maahi");
        System.out.println("Lk="+lk);
//changing ele
lk.set(1,"nani");
System.out.println("Lk="+lk);
lk.remove(1);
System.out.println("Lk="+lk);
lk.remove("kunal");
System.out.println("Lk="+lk);
int y=lk.size();
System.out.println("Lk size="+y);
//using get method
for(int i=0;i<lk.size();i++){
    System.out.println(lk.get(i));
}
// or using for-each loop
for(String s:lk){
    System.out.println("Lk="+s+" ");
}
//using toArray();
Object[] a=lk.toArray();
System.out.println("Lk coverted into arrray=");
for(Object k:a){
    System.out.println(k+" ");
}
lk.addFirst("yummy");
lk.addLast("Byeeee");
//shuffle the data in list
Collections.shuffle(lk);
System.out.println("Lk="+lk);
lk.removeFirst();
System.out.println("Lk="+lk);
lk.removeLast();
System.out.println("Lk="+lk);
//a collection is created
Collection<String>c=new ArrayList<String>();
c.add("20");
c.add("87");
//here lk is added to collection
lk.addAll(c);
System.out.println(lk);
//here we r changing position in lk to add collection list
lk.addAll(1,c);
System.out.println("New lk="+lk);
//creating another lk and copying
LinkedList ll =new LinkedList();
ll=(LinkedList)lk.clone();
System.out.println("Second lk="+lk);
/*priority addition in queues
int thres=20;
while(!lk.isEmpty()){
    int t=lk.poll();
    //adding >=20 at front and rest at back.
    if(t>=20)//if lk is integer then it is correct.
    ll.offerFirst(t);
    else
    ll.offerLast(t);
}
System.out.println("New lk="+ll);
*/
//creating a clone-->create a copy of it and  another method.
lk.clone();
System.out.println(" Second  another lk="+lk);
//list.contains(ele)------>this method returns True if the element is present in the LinkedList otherwise it returns False.
System.out.println("Does the List contains 'Hello': " + lk.contains("Hello"));
      // Check if the list contains "20"
      System.out.println("Does the List contains '20': "+ lk.contains("20"));
      // Check if the list contains "Geeks"
      System.out.println("Does the List contains 'Geeks': "+ lk.contains("Geeks"));
//get index of ele in list
System.out.println("2 index of lk is:"+lk.get(2));
//printing 1st,2nd ele in lists
System.out.println("1st ele="+lk.getFirst()+" "+"2nd ele is"+lk.getLast());
//list.indexOf(ele)-->returns the index or position of the first occurrence (****ONLY****) of the element in the list else -1 if the element is not present in the list. The returned value is of integer type.
System.out.println(lk.indexOf("manu"));
System.out.println(lk.indexOf("mumba"));
//list.lastIndexOf(ele)--->returns the index or position of the last ele occurence in lk
System.out.println(lk.lastIndexOf("20"));
ListIterator list_Iter = lk.listIterator();//without a specified position
        // Setting the ListIterator at a specified position
     //   ListIterator list_Iter = lk.listIterator(2);
        // Iterating through the created list from the position
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
           System.out.println(list_Iter.next());
        }
        //offer(ele)-->add ele at last in list
        lk.offer("amma");
        System.out.println(lk);
        lk.offerFirst("nanna");
        lk.offerLast("rinku");
        System.out.println(lk);
//peek()-->it only retreives  1st ele in lk.
System.out.println("Head  of lk="+lk.peek());
System.out.println(lk.peekFirst());
System.out.println(" peek last lk="+lk.peekLast());
//poll removes and print 1st ele in  lk
System.out.println(" poll lk="+lk.poll());
System.out.println(" poll 1st--lk="+lk.pollFirst());
System.out.println(" poll Second lk="+lk.pollLast());
System.out.println("  lk="+lk.pop());//it is same as lk.poll()
System.out.println("  lk="+lk);
System.out.println(" removes 1st ele in lk="+lk.remove());
lk.push("20");
System.out.println(" lk="+lk);
lk.removeFirstOccurrence("20");
lk.removeLastOccurrence("20");
System.out.println("  lk="+lk);
//splititerator()
// each string represents city name
lk.add("Delhi 6");
lk.add("3 Idiots");
lk.add("Stree");
lk.add("Airlift");
// using spliterator() method
Spliterator<String> names = lk.spliterator();
// print result from Spliterator
System.out.println("list of Movies:");
// forEachRemaining method of Spliterator
names.forEachRemaining((n) -> System.out.println("Movie Name: " + n));
    }
}
//things i left is:toString(),descendingIterator()-->(where exceptional handling is needed here)
