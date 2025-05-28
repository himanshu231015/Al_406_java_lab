import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo1 {
    public static void main(String[] args){
        int x = 9000,y=1212;
        float z = 666.777f;
        try{
            FileOutputStream fos = new FileOutputStream("Data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(x);
            dos.writeInt(y);
            dos.writeFloat(z);

            FileInputStream fis = new FileInputStream("Data.txt");
            DataInputStream dis = new DataInputStream(fis);
            int a = dis.readInt();
            int b = dis.readInt();
            float t = dis.readFloat();
            System.out.println("A : "+a);
            System.out.println("B : "+b);
            System.out.println("T = "+t);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
