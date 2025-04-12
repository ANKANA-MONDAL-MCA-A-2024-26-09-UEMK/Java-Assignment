//Write java codes to implement the followings – Basic string handling concepts- Concept of mutable and immutable string, Methods of String class-charAt(), compareTo(), equals(), equalsIgnoreCase(), indexOf(), length() , substring().; toCharArray(), toLowerCase(), toString(), toUpperCase() , trim() , valueOf() methods 


public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
System.out.println("Character at index 1: " + s.charAt(1));
System.out.println("Compare to 'hello world': " + s.compareTo("hello world"));
System.out.println("Equals: " + s.equals("Hello World"));
System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase("hello world"));
System.out.println("Index of 'o': " + s.indexOf('o'));
System.out.println("Length: " + s.length());
System.out.println("Substring (0, 5): " + s.substring(0, 5));
System.out.println("To Char Array: " + java.util.Arrays.toString(s.toCharArray()));
System.out.println("To Lower Case: " + s.toLowerCase());
System.out.println("To Upper Case: " + s.toUpperCase());
System.out.println("Trim: " + s.trim());
System.out.println("Value Of 100: " + String.valueOf(100));
    }
}
