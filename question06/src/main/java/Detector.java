import java.util.HashSet;
import java.util.Set;

public class Detector {
    private Set<String> invalid = new HashSet<>();

    public boolean isShuffle(String str1, String str2, String shuffle) {
        if (shuffle.length() != (str1.length() + str2.length())) {
            return false;
        }

        return _isShuffle(str1, str2, shuffle);
    }

    public boolean _isShuffle(String str1, String str2, String shuffle) {
        if (shuffle.length() == 0) {
            return true;
        }

        if (invalid.contains(str1 + "/" + str2)) { // TEMP
            return false;
        }

        if (!str1.isEmpty() && shuffle.charAt(0) == str1.charAt(0)) {
            if (_isShuffle(str1.substring(1), str2, shuffle.substring(1))) {
                return true;
            }
        }

        if (!str2.isEmpty() && shuffle.charAt(0) == str2.charAt(0)) {
            if (_isShuffle(str1, str2.substring(1), shuffle.substring(1))) {
                return true;
            }
        }

        invalid.add(str1 + "/" + str2);

        return false;
    }
}
