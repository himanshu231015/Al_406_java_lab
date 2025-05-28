class test{
    public static void main(String[] args) {
    String s1 = "        My name is vivek choudhary     ";

    //length of string
    System.out.println(s1.length());

    //replace word in string
    System.out.println(s1.replace("vivek", "VIVEK"));    
    
    //toUpperCase
    System.out.println(s1.toUpperCase());

    //toLowerCase
    System.out.println(s1.toLowerCase());

    //remove leading and trailing spaces
    System.out.println(s1.trim());

    //char at given index
    System.out.println(s1.charAt(14));

    //compare two strings according to dictionary returns 0 if both strings are equal
    System.out.println(s1.compareTo("I live in Indore"));
    System.out.println(s1.compareTo("A"));
    System.out.println(s1.compareTo("        My name is vivek choudhary     "));


    }
}
