package OPERATOR;

public class dot_operator {

    public static void main(String[] args) {
        calculator calculator = new calculator();
        int d = calculator.add(23,33) ;
        System.out.println("sum = " + d);
    }

}
class calculator {

    public int add(int a , int b ){
        int c= a+b;
        return c;
    }
}