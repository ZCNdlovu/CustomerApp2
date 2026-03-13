package za.ac.cput.domain;

public class CustomerGenerator {
    private static CustomerGenerator instance;
    private int currentId;

    private CustomerGenerator(int currentId) {
        this.currentId = currentId;
    }
    public static CustomerGenerator getInstance() {
        if(instance == null) {
            instance = new CustomerGenerator(1000);
        }
        return instance;
    }
    public int genarateId() {
        return ++currentId;
    }

}
