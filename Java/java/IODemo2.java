import java.io.*;
public class IODemo2 {
    int x = 0,y = 0;
    boolean b = false;
    public static void main(String[] args) {
        try{
            IODemo2 d1 = new IODemo2();
            d1.x = 9090;
            d1.y = 2323;
            d1.b = true;

            FileOutputStream fos = new FileOutputStream("IODemo2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d1);
            oos.flush();

            FileInputStream fis = new FileInputStream("IODemo2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            IODemo2 t1 = (IODemo2)ois.readObject();
            System.out.println(t1.x);
            System.out.println(t1.y);
            System.out.println(t1.b);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
