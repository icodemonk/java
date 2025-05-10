package Arrays;

public class array {

//    /defination : array is a object of single data type values in a fixed number
//Array is also known as static data structure because size of an array
//    must be specified at the time of its declaration.

//    use case: datatype[] arr =new datatype[size];

    public static void main(String[] args) {
        int[] arr=new int[5];
         arr[0]=10;
        arr[1]=40;
        arr[2]=30;
        arr[3]=20;
        arr[4]=10;
        for (int x:arr){
            System.out.println(x);
        }


//  -----------------------------------------------------------
        int[] aar={12,134,23,24,53};
        for (int x:aar){
            System.out.println(x);
        }
    }
}
