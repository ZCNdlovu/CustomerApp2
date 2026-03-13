package za.ac.cput.util;

import java.util.regex.Pattern;

public class EmailValidator {
    public static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    public static final Pattern PATTERN = Pattern.compile(REGEX_EMAIL);
    public static void validate(String email){
        UtilValidator.requireNotEmptyOrNull(email,"Email");
        if(!PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid Email");
        }
    }
}
