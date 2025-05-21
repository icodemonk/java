package Exception_Handiling;

public class PRACTICEexception {

    public static void main(String[] args) {


    int a = 10;
    try {

        int b=a /0;
        System.out.println(b);

    }
    catch(Exception e){
            System.out.println(e.toString());
        }






    }

}
