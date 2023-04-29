import java.io.*;
class Em{
    String name;
    int id;
    Em(int i,String n){
        id=i;
        name=n;
    }
    void dis(){
        System.out.println(id+"\t"+name);
    }
}
public class Storeobj{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //create Employee type array with size s
        Em arr[]=new Em[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter id:");
            int id=Integer.parseInt(br.readLine());
            System.out.print("Enter name:");
            String k=br.readLine();
            arr[i]= new Em(id,k);
        }
        System.out.println("\n Employee data is:");
        for(int i=0;i<arr.length;i++){
            arr[i].dis();
        }
        }
}