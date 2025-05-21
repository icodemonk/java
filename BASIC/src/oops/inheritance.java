package oops;

public class inheritance {
    //Inheritance is used to create a subclass that extend all the property of parent class .
    public static void main(String[] args) {
        ssdw ss =new ssdw();
        ss.printq();
    }


}
class ssd{
    int num = 12 ;
    void printq(){
        System.out.println("hello");
    }
}
class ssdw extends ssd{
    int numm=11;

    @Override
    void printq() {
        super.printq();
    }
}
