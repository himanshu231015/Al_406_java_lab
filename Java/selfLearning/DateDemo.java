import java.util.Date;
public class  DateDemo{
    public static void main(String[] args) {
        new Date();     //creating constructor of Date class,this expression constructs new object and it's initialized to current date and time
        
        //applying method to object
        String s = new Date().toString();         //alternate option

        
        // Date birthDay = new Date();              //storing new object in variable , here birthDay is a object variable

        // Date deadline ;                          //deadline is object variable and not an object & it does't refer to any object
        // deadline = new Date();

        Date deadline = new Date();             /* here "new Date()" makes an object of type date, and its value is a reference to that newly created object\
                                                    that reference is then stored in the deadline variable.  */
        //an object variable doesn't actually contain an object. It only "refers" to an object
        System.out.println(s);
        System.out.println(new Date());
    }
}
