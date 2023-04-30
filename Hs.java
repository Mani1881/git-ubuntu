//Hashset doesn't allow duplicate items
import java.util.HashSet;
import java.util.Iterator;;
public class Hs{
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
         hs.add("manu");
         hs.add("Apple");
         hs.add("pallavi");
        hs.add("lilly");
        hs.add("Nani");
        System.out.println("Hashset is="+hs);
        //add an iterator to hs.
        Iterator it=hs.iterator();
        //display ele using Iterator
    while(it.hasNext()){
        String s= (String)it.next();
        System.out.println(s);
    }
    //it deletes last item in hashset and called only once
    it.remove();
    System.out.println("New hashset "+hs);
        }
}