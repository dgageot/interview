public class Sentence {
    private final String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String reverseWords() {
        StringBuilder reversed = new StringBuilder();

        int wordStart = 0;
        int wordLength = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                if (wordLength > 0) {
                    appendReversed(wordStart, wordLength, reversed);
                    wordStart = i + 1;
                    wordLength = 0;
                }
            } else {
                if (wordLength == 0) {
                    wordStart = i;
                }
                wordLength++;
            }
        }

        if (wordLength > 0) {
            appendReversed(wordStart, wordLength, reversed);
        }

        return reversed.toString();
    }

    private void appendReversed(int start, int length, StringBuilder appendTo) {
        if (appendTo.length() > 0) {
            appendTo.append(' ');
        }
        for (int i = start + length - 1; i >= start; i--) {
            appendTo.append(text.charAt(i));
        }
    }
}
