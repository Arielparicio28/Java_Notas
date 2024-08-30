package Expresiones_Regulares_Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ClaseMatcher {

    public static void main(String[] args) {
        //Pattern.CASE_INSENSITIVE- Se ignorará el uso de mayúsculas y minúsculas al realizar una búsqueda.
        Pattern pattern = Pattern.compile("nap time", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Every morning starts with some nap time!");

        boolean findPattern = matcher.find();
        System.out.print(findPattern);
    }
}
