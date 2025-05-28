import java.util.Vector;

public class VecDemo {
    public static void  main(String[] args){
        Vector v1 = new Vector();
        System.out.println("capacity = " + v1.capacity());
        for(int i = 1; i<= 10;i++){
            v1.add(i);
        }
        System.out.println("Values = " + v1);
        System.out.println("Capacity = "+v1.capacity());
        v1.add("Hey");
        System.out.println("Values = " + v1);
        System.out.println("Capacity = "+v1.capacity());

        }
}
