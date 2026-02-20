package za.ac.cput.domain;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Customer(Builder builder){
        this.customerId = builder.customerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static class Builder{
        private String customerId;
        private String firstName;
        private String lastName;
        private String emailAddress;

        // 1. CONSTRUCTOR: Forces ID and Email immediately
        public Builder createCus(String customerId, String emailAddress) {
            this.customerId = customerId;
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        // 2. OPTIONAL METHOD: For the first name
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        // 3. OPTIONAL METHOD: For the last name
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

public Builder copy(Customer cus){
            this.customerId = cus.customerId;
            this.firstName = cus.firstName;
            this.lastName = cus.lastName;
            this.emailAddress = cus.emailAddress;
            return this;
}
        public Customer build() {
            return new Customer(this);
        }
    }
}
