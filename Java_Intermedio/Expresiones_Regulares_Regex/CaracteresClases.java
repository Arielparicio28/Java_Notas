package Expresiones_Regulares_Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

//[]denota clase de personaje
public class CaracteresClases {
    public static void main(String[] args) {
                                          //busco las coincidencias con gray y grey.
        Pattern pattern = Pattern.compile("gr[ae]y", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
        int count = 0;
        while(matcher.find())count++;
        System.out.println(count);
    }
}
