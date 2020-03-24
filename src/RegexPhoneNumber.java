import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PhoneNumber_REGEX = "^[0]+[0-9]{9}$";

    public RegexPhoneNumber() {
        pattern = Pattern.compile(PhoneNumber_REGEX);
    }

    public boolean validate(String regex){
        matcher =pattern.matcher(regex);
        return matcher.matches();
    }
}
