package pattetns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Java but not boolean";

        Pattern pattern = Pattern.compile(".*\\bJava\\b.*");
        Matcher matcher = pattern.matcher(text);
        boolean b = matcher.matches();
        if (b == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
