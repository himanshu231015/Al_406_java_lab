public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0;i<a.length;i++){
            a[i] = i;
        }
        System.out.println(a[14]);

        // for(int i:a){                            //for each loop
        //     System.out.println(count);
        // }

        System.out.println(a.toString());
    }
    
}
