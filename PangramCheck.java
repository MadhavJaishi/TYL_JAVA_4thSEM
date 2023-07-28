public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
    public static boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }
}
