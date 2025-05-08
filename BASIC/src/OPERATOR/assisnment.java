package OPERATOR;

public class assisnment {
    //defination : Assignment operators are used to assign a value to a variable. It can also
    //be used combine
    //with arithmetic operators to perform arithmetic operations and then
    //assign the result to the
    //variable. Assignment operator supported by Java are as follows:
    // use case : = , += ,-= , /= , %= ,*=

    public static void main(String[] args) {
        int a = 12 ;
        int b = 34 ;
        int c = a+=b;
        int d= (a+b) ;
        System.out.println(" a+=b is same as a=a+b " + "c " + c + " d  " + d);
    }
}
