@FunctionalInterface
interface A{
   void disp();
   String toString();
   int hashCode();
   //void print();

}
public class pattern
{
    public static void main(String[] args) {
        A obj= ()->System.out.println("in obje hi");

        A obj1=()->
          
          
            return getClass().getName() + "@" +Integer.toString(hashCode())
         
        
          obj.disp();
        
    }
}