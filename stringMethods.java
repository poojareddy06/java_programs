public class stringMethods {
    public static void main(String[] args) {
        String str = "java programming";
        System.out.println("Original String: " + str);
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring from index 5 to 11: " + str.substring(5, 11));
    }
}
