public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}