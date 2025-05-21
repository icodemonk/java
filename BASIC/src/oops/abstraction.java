package oops;

public class abstraction {
    // abstraction is a way to hide all the inner implatantaion from user just showing them blueprint
    // abstration acheived by abstract keyword and interfaces .
    public static void main(String[] args) {

    raooshop raooshop=new raooshop();
        raooshop.message();
        raooshop.text();

    }
}
abstract class bank{
    abstract void message();
    abstract void text();

}

class raooshop extends bank{

    @Override
    void message() {
  System.out.println("Hello");
    }

    @Override
    void text() {
        System.out.println("I AM ADITYA FROM ROOO SHOP");

    }
}