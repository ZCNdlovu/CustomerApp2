package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.regex.Pattern;

public class Helper {
    public static boolean isNullorEmpty(String str){
        return str == null || str.isEmpty();
    }
    public static boolean isValidEmail(String email){
    return isValidEmailWithRegex(email);
    }
    public static boolean isValidEmailWithRegex(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return Pattern.matches(regex, email);
    }
    public static boolean isValidEmailWithApacheCommons(String email){
        return EmailValidator.getInstance().isValid(email);
    }
}
