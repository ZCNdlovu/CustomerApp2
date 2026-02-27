package za.ac.cput.util;

import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValidEmailWithApacheCommons(String email){
        return org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(email);
    }
    public static final String RAGEX_EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

    public static final Pattern PATTERN = Pattern.compile(RAGEX_EMAIL);
    public static void Validate(String email){
        if(!PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException(email + " is not a valid email");
        }

    }
}
