public class Sentence {
    private final String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String reverseWords() {
        StringBuilder reversed = new StringBuilder();

        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                if (currentWord.length() > 0) {
                    appendReversed(currentWord, reversed);
                    currentWord = "";
                }
            } else {
                currentWord += c;
            }
        }

        if (currentWord.length() > 0) {
            appendReversed(currentWord, reversed);
        }

        return reversed.toString();
    }

    private void appendReversed(String word, StringBuilder appendTo) {
        if (appendTo.length() > 0) {
            appendTo.append(' ');
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            appendTo.append(word.charAt(i));
        }
    }
}
