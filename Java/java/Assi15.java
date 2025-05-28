import java.util.Scanner;
public class Assi15 {
    public static void main(String[] args) {
        float salary,gross_salary,DA,HRA,Basic;
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        n.info();
        System.out.print("what's your salary : ");
        salary = scr.nextFloat();

        if (salary > 0 && salary < 1500){
            Basic = salary;
            DA = (90*salary)/100;
            HRA = (10*salary)/100;
            gross_salary = Basic + DA + HRA;
            System.out.println("your gross salary is : "+gross_salary);

        }else if(salary >= 1500){
            Basic = salary;
            DA = (98*salary)/100;
            HRA = 500;
            gross_salary = Basic + DA + HRA;
            System.out.println("your gross salary is : "+gross_salary);
        }else{
            System.out.println("wrong input");
        }
    }
    
}
