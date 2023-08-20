import java.util.Scanner;
import java.util.regex.Pattern;


class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().getPattern()));
        }
    }

    
public class MyRegex {
    private static final String IPV4_REGEX =
        "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private Pattern pattern;

    public MyRegex() {
        pattern = Pattern.compile(IPV4_REGEX);
    }

    public String getPattern() {
        return pattern.pattern();
    }

    public boolean validateIPAddress(String ipAddress) {
        return pattern.matcher(ipAddress).matches();
    }
}
}
