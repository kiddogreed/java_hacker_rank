/**
 * Regex
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {

     private static final String IPV4_REGEX =
        "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private Pattern pattern;

    public Regex() {
        pattern = Pattern.compile(IPV4_REGEX);
    }

    public boolean validateIPAddress(String ipAddress) {
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Regex validator = new Regex();

        String[] testIPs = {
            "192.168.1.1",
            "0.0.0.0",
            "255.255.255.255",
            "256.0.0.1",
            "123.045.067.089",
            "10.10.10.10",
            "192.168.0.256",
            "300.200.100.50"
        };

        for (String ip : testIPs) {
            boolean isValid = validator.validateIPAddress(ip);
            System.out.println(ip + " is valid? " + isValid);
        }
    }
}