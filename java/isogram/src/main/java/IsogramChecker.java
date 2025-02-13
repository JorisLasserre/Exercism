import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        HashSet<Character> listChar = new HashSet<>();

        for (char c : phrase.toCharArray()) {
            if (c == ' ' || c == '-'){
                continue;
            }else{
                if (listChar.contains(c)) {
                    return false;
                }
                listChar.add(c);
            }
        }

        return true;
    }

}
