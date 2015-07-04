public class Sentence {
    private final String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String reverseWords() {
        String cleanText = text.trim();

        StringBuilder reversed = new StringBuilder();

        for (int i = cleanText.length() - 1; i >= 0; i--) {
            reversed.append(cleanText.charAt(i));
        }

        return reversed.toString();
    }
}
