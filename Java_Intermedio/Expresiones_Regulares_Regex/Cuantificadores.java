package Expresiones_Regulares_Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Cuantificadores {
    public static void main(String[] args){
        String[] strings = {"CCQQ", "QQCC", "CQQ", "QUACK", "CCQ", "CQC", "CQQQ", "CCCQQ"};

                                         // Que alla una o más de un C seguida de 2Q.
        Pattern pattern = Pattern.compile("C+Q{2}");
        Matcher matcher;

        for(String s: strings){
            matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
}}
