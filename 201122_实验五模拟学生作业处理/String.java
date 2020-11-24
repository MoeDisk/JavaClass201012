package five;

public class String {
    public static String rulesInsert(String source, String insertion, int startAt, int step, int jump) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= source.length(); i++) {
            if (i >= startAt) {
                if ((i + jump) % step == 0) {
                    result.append(insertion);
                }
            }
            if (i < source.length()) result.append(source.charAt(i));
        }
        return result.toString();
    }
    public static int countString(String source, String search) {
        int count = 0;
        char[] c = source.toCharArray();
        char[] s = search.toCharArray();
        sourceloop:
        for (int i = 0; i < c.length; i++) {
            int j = 0;
            for (; j < search.length(); j++) {
                if (s[j] != c[i + j]) {
                    i += j;
                    continue sourceloop;
                }
            }
            count += 1;
            i += j;
        }
        return count;
    }
}
