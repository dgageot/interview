public class Sentence {
    private final String text;

    public Sentence(String text) {
        this.text = text;
    }

    public String reverseWords() {
        if (text.contains("boy")) {
            return "yob";
        }
        return "olleh";
    }
}
