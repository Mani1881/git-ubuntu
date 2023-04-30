import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//import javax.lang.model.util.ElementScanner6;
public class Stac{
    public static void main(String[] args)throws IOException {
//create a empty stack to contain Integer objects 
        Stack<Integer>st=new Stack<Integer>(); 
       int ch=0,pos,ele;
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       while(ch<5)
       {
        System.out.println("Stack Operations:");
        System.out.println("1: push ");
        System.out.println("2: pop ");
        System.out.println("3: peep ");
        System.out.println("4:Search: ");
        System.out.println("5:Exit");
        System.out.print("Enter ur choice");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:        System.out.println("Enter ele to push ");
                         ele =Integer.parseInt(br.readLine());
                         //int type ele is converted into Integer object
                         st.push(ele);
                         break;
            case 2:     //top most ele is deleted
                        Integer k=st.pop();
                        System.out.println("Popped ele="+k);
                        break;
            case 3:        System.out.println("Peek ele is "+st.peek());
                        break;
            case 4:         System.out.println("Enter ele to search");
            ele =Integer.parseInt(br.readLine());
            //int type ele is converted into Integer object
             pos=st.search(ele);
             if(pos==-1)
             System.out.println("Ele not found");
             else 
             System.out.println("Position found"+pos);
            break;
            default:return;
        }
        System.out.println("STack contents r:"+st);
       }

    }
}