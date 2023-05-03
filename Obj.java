class One{
  //obj2 is class 2's reference
  Two obj2;
  //intialize obj2
  One(Two obj2){
    this.obj2=obj2;
  }
  double cube(double x){
    //call  class 2's method using obj2
    double res=x*obj2.squ(x);
    return res; 
  }
}
class Two{
    //obj3 is class Three's reference
    Thr  obj3;
    Two(Thr obj3){
        this.obj3=obj3;
    }
    double squ(double x){
        double res=x*obj3.get(x);
        return res;
    }
}
class Thr{
    double get(double x){
        //just return x value to class Two
        return x;
    }
}
public class Obj {
    public static void main(String[] args) {
        Thr obj3=new Thr();
        Two obj2=new Two(obj3);
        One obj1=new One(obj2);
        double res1=obj1.cube(5);
        System.out.println("Cube of 5="+res1);
        double res2= obj2.squ(6);
        System.out.println("Square of 6="+res2);
        
    }
}
