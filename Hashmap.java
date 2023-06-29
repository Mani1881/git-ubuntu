 //In hashMaps the keys are unique but values may be same and it is Thread-unsafe:
 //HashMaps are unordered and takes O(1) time complexity.
 //it allows null key only once 
 //it can have multiple null values
 import java.util.*;
 class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //put()
        hm.put("India",125);
        hm.put("USA",89);
        hm.put("China",345);
        hm.put("Australia",70);
        System.out.println(hm);
        //get()
        System.out.println(hm.get("USA"));
        System.out.println(hm.get("Indonesia"));
        //remove key
        hm.remove("India");
        //hm.remove(70);
        //remove(key,value);
        hm.remove("USA",89);
        System.out.println(hm);
        //containsKey(),containsValue()
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsValue(70));
        //clone
        System.out.println(hm.clone());
        //iteration
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            System.out.println(e.getKey()+"   "+e.getValue());
        }
        //size
        System.out.println(hm.size());
        hm.put("Indonesia",345);
        System.out.println(hm);
        //using generics
        Map<String,Integer>hm2=new HashMap<>(hm);
        hm2.put("Manu",7898);
        hm2.put("Kunal",453);
        System.out.println(hm2);
        //compute(Key, BiFunction) method of HashMap class allows you to automatically update a value in HashMap. 
        // remap the values using compute() method
      //  hm2.compute("Manu", (key, val)-> val.concat("ygyg"));
        hm2.compute("kunal", (key, val)-> val.concat(78));
  
    }
}
