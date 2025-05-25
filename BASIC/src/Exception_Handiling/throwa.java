package Exception_Handiling;

public class throwa {
    public static void main(String[] args) {

//        defination: throw are used o give a self made (custom )eror message


        try {
            throw new ArithmeticException("hello i am error ");
        }
        catch (ArithmeticException e){
        System.out.println(e.getMessage());

        }













    }

}
