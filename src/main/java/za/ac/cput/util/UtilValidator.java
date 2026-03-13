package za.ac.cput.util;

public class UtilValidator {
    public static void requireNotEmptyOrNull(String value, String fieldName) {
        if(value==null || value.isEmpty()){
            throw new IllegalArgumentException(fieldName+" cannot be empty");
        }
    }
    public static void requireNotNegative(int value, String fieldName){
        if(value <0){
            throw new IllegalArgumentException(fieldName+" cannot be negative");
        }
    }
}
