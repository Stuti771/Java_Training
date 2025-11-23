package lecture3;

public class StringOperations {
    public static void main(String[] args) {
        String s = "HeLlo";
        System.out.println("String="+s);
        System.out.println("Length="+s.length());  //prints length
        System.out.println("Char at given index="+s.charAt(2));  //converts to lowercase
        System.out.println("Uppercase="+s.toUpperCase());  //converts to uppercase
        System.out.println("Lowercase="+s.toLowerCase());  //converts to lowercase
        System.out.println("Index of given char="+s.indexOf("o"));  //prints index of given char
        System.out.println("Substring="+s.substring(2));  //prints substring
        System.out.println("Substring="+s.substring(1, 4));  //prints substring

        System.out.println();
        String str = " hello ";
        System.out.println("String="+str);
        System.out.println("length="+str.length());
        System.out.println("Updated string="+str.trim());  //removes space from string
        System.out.println("Length of updated string="+str.trim().length());
    }
}
