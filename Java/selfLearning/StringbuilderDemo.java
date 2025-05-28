class StringBuilderDemo {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("Java");       //constructor of StringBuilder
        s1.append(" programming");                          //appends string 
        System.out.println(s1);

        //returns length of string
        System.out.println(s1.length());
    }
}
