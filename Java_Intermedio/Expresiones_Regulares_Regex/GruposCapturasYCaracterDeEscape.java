package Expresiones_Regulares_Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//[]denota clase de personaje y ()denota grupo de captura.
public class GruposCapturasYCaracterDeEscape {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher("1\n2\n3\n4\n5\n6\n7\n8\n9\n10");

        int i = 0;
        while (matcher.find()) {
            i++;
        }
        System.out.println(i);
    }
}
