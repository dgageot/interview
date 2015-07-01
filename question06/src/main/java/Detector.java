public class Detector {
    public boolean isShuffle(String str1, String str2, String shuffle) {
        if (shuffle.length() != (str1.length() + str2.length())) {
            return false;
        }

        if (shuffle.length() == 0) {
            return true;
        }

        return true;
    }
}
