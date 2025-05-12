package STRING;

public class Strinfbuffer {

    // it create a string that will be mutable with thread saftey
//    creating a new string
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer();

//        Adding element
    s.append("Hello");
    s.append(" ");
    s.append("Hellow world");

//    String with a String buffer value
    String str = s.toString();
        System.out.println(str);

//        tostring is used to make a var to immutable

//        There are there 3 constrctor :
//StrinfBuffer() / StringBuffer(int size) /StringBuffer(STRING)
//defult is 16 more characters
//        Methods of Java StringBuffer Class
//        Methods	Action Performed
//        append()	Used to add text at the end of the existing text.
//        length()	The length of a StringBuffer can be found by the length( ) method.
//        capacity()	the total allocated capacity can be found by the capacity( ) method.
//         charAt()	This method returns the char value in this sequence at the specified index.
//        delete()	Deletes a sequence of characters from the invoking object.
//         deleteCharAt()	Deletes the character at the index specified by the loc.
//        ensureCapacity()	Ensures capacity is at least equal to the given minimum.
//        insert()	Inserts text at the specified index position.
//         length()	Returns the length of the string.
//        reverse()	Reverse the characters within a StringBuffer object.
//         replace()	Replace one set of characters with another set inside a StringBuffer object.
//
    StringBuffer ss=new StringBuffer();
    ss.append("HELLO ");
        System.out.println(ss);
        System.out.println(ss.capacity());

        System.out.println(ss.charAt(2));
        System.out.println(    ss.length());
        System.out.println(ss.delete(1,2));//START FROM 1 END ON 2

        System.out.println(ss.deleteCharAt(1));
        System.out.println(       ss.insert(1,2));

    }
}
