import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LstDemo {
    public static void main(String[] args){
        List<String> lt = new ArrayList<>();
        lt.add("Kunal");
        lt.add("dhamal");
        lt.add("anuj");
        lt.add("indore");
        lt.add("zoo");
        lt.add("xyz");
        for(String s1:lt){
            System.out.println(s1);
        }
        Collections.sort(lt);   //sorting of list
        for(String s1:lt){
            System.out.println(s1);
        }
        
    }
}
