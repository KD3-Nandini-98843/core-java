public class q1 {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = "";

        // Loop backwards from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
