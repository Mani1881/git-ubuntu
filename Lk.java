import java.io.*;
import java.util.*;
public class Lk {
    public static void main(String[] args) throws IOException{
        //create an empty lk to store Strings
        LinkedList <String> lk=new LinkedList<>();
        lk.add("manu");
        lk.add("Kunal") ;
        lk.add("Bhuvi");
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
System.out.println("Lk="+lk);
lk.removeFirst();
System.out.println("Lk="+lk);
lk.removeLast();
System.out.println("Lk="+lk);
}
}
