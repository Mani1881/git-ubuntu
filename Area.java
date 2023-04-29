public class Area{
public static void main(String[] args) {
    final double PI=(double)22/7;//constant
        double r=15.5;
        double area=PI*r*r;
        System.out.println("Area of circle="+area);
    //create NumberFormat class object
    //getNumberInstance() is a factory method
   NumberFormat obj=NumberFormat.getNumberInstance();
    //store format information into obj
    obj.setMaximumFractiondigits(2);
    obj.setMinimumIntegerDigits(7);
    //apply format to area value
    String s=obj.format(area);
    System.out.println("Formatted area="+s);
    
}
}
