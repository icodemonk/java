package CONTROL_STATEMENT;

public class Loop_statement {

// defination : in loop there are three loop statement 1st: for , 2nd: While ,3rd :do while

    public static void main(String[] args) {
//        for practice
        System.out.println("For loop started");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("While loop started");
//    while practice
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
//        do while loop practice

        System.out.println("DO while loop started");


        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
