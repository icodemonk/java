package oops;

public class interfacesss {

    public static void main(String[] args) {

        message mewssage =new message();
        String a=mewssage.message();
        System.out.println(a);
    }
}

interface aditya{
    String message();
}

class message implements aditya {
    @Override
   public String message() {
       return "hello";
    }

}