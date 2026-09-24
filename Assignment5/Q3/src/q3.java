public class q3 {
    public static void main(String[] args) {
        String text = "  Java is a fun programming language   ";
        String cleanedText = text.trim();
        if (cleanedText.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = cleanedText.split("\\s+");
            
            System.out.println("Word count: " + words.length);
        }
    }
}
