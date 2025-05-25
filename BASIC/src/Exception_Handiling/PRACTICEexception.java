package Exception_Handiling;

public class PRACTICEexception {

    public static void main(String[] args) {

//        defination of exception: exception is a unwanted flow of program that disturb and stop the code .

        // we also called such code as risky code



        try {
        int a = 10/0;
        System.out.println(a);
            System.out.println("i am in a try block");

        }catch (ArithmeticException e){
//            System.out.println("i am in a catch block");
//            System.out.println(e.toString());
//            e.printStackTrace();
//            System.out.println( e.getMessage());
           throw new ArithmeticException("I AM IN CATCH BLOCK THERE IS ERROR IN 10/0 ");
        }

    }

}
