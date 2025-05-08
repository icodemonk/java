package OPERATOR;

public class new_operator {
    public static void main(String[] args) {
        calculatorr calculator = new calculatorr();
        int d = calculator.add(23,33) ;
        System.out.println("sums = " + d);
    }

}
class calculatorr {

    public int add(int a , int b ){
        int c= a+b;
        return c;
    }
}
