package oops;

public class Encapsulation {

    // defination : encapsulation is usedto bind a data and method together in one class andprovide them addetionmal security

    public static void main(String[] args) {
        addition asddition=new addition();
        System.out.println( asddition.sum());

    }
    }


class addition{
    int num =1;
    int num2 =2;

    int sum(){
        return num+num2;
    }}

