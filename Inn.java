import java.io.*;
class Bankacc{
private double bal;
Bankacc(double b){
    bal=b;
}
void contact(double r)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter password:");
    String pswd=br.readLine();
    if(pswd.equals("xyz123")){
        //creating an object inside a method
        Interest in=new Interest(r);
        in.calInterest();
    }
    else{
        System.out.println("Sorry u r not an authorized person");
        return;
    }
}
//*********************inner class begins*******************
private class Interest{
    private double rate;
    Interest(double r){
        rate=r;
    }
    void calInterest(){
        double interest=bal*(rate/100);
        bal+=interest;
        System.out.println("Updated Balance="+bal);
    }
}
}
public class Inn {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //bank account is holding a balance of 10000
        Bankacc acc=new Bankacc(10000);
        System.out.println("Enter rate:");
        double rate=Double.parseDouble(br.readLine());
        acc.contact(rate);
    }
}
