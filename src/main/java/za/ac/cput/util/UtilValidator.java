package za.ac.cput.util;

public class UtilValidator {
    public static boolean requireNotEmptyOrNull(String value, String fieldName){
        if(value == null || value.isEmpty()){
            throw new IllegalArgumentException(fieldName + " is null or empty");
        }
        return true;}

    public static void requireNotNegative(int value, String fieldName){
        if(value > 0){
            throw new IllegalArgumentException(fieldName + " is negative");
        }
    }

}
