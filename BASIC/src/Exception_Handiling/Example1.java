package Exception_Handiling;

class ThrowExample {
    public int myMethod(int num)throws ArithmeticException{

        int a= 10/num;
        return a;

    }
}

public class Example1{
    public static void main(String args[]){
        try{
            ThrowExample obj=new ThrowExample();
            int reault = obj.myMethod(0);
            System.out.println(reault);
        }catch(Exception ex){
            System.out.println("i have handeled a exception chill");
            System.out.println(ex.toString());
        }

    }
}