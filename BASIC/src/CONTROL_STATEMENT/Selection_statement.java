package CONTROL_STATEMENT;

import java.util.Scanner;

public class Selection_statement {

    // defination : in selection statement there is if which is used wwhen given condition s true the code will bw executed within the curly braces otherwise else will run
//    use case : if (SIMPLE if , if-else , nested if , if else if ) , switch

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter your choice in 1,2");
        int a= sc.nextInt();
        if (a==1){
            System.out.println("i am in if 1");
        } else if (a==2) {
            System.out.println("i am in if 2");
        }else {
            System.out.println("i am in else");
        }

        switch (a){
            case 1 :
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("i am in default");

        }
    }
}
