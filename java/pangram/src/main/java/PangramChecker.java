import java.util.regex.Pattern;
public class PangramChecker {
    //regex
    public boolean isPangram(String input) {
        return  input.matches("^(?=.*[aA])(?=.*[bB])(?=.*[cC])(?=.*[dD])(?=.*[eE])(?=.*[fF])(?=.*[gG])(?=.*[hH])(?=.*[iI])(?=.*[jJ])(?=.*[kK])(?=.*[lL])(?=.*[mM])(?=.*[nN])(?=.*[oO])(?=.*[pP])(?=.*[qQ])(?=.*[rR])(?=.*[sS])(?=.*[tT])(?=.*[uU])(?=.*[vV])(?=.*[wW])(?=.*[xX])(?=.*[yY])(?=.*[zZ]).+$");
    }
    //other solution
    // return input.toLowerCase().chars()
    //                .filter(i -> i >= 'a' && i <= 'z')
    //                .distinct()
    //                .count() == 26;
}
