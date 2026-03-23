package za.ac.cput.domain;

import za.ac.cput.util.Helper;

public class Customer {
    private int id;
    //private String Id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;

    public Customer(Builder builder){
        this.id = builder.id;
       // this.Id = builder.Id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
        this.age = builder.age;

    }

    public int getId() {
        return id;
    }
//    public String getID() {
//        return Id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", ID='" + id + '\'' +
//                ", MYID='" + Id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
       // private String Id;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private int age;

        // 1. CONSTRUCTOR: Forces ID and Email immediately
        public Builder createCus(String firstName, String emailAddress) {
            this.firstName = firstName;
            this.emailAddress = emailAddress;
            return this;
        }
//        public Builder setID(String Id) {
//            this.Id = Id;
//            return this;
//        }
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
        public Builder setAge(int age){
            this.age = age;
            return this;
        }

public Builder copy(Customer cus){
            this.id = cus.id;
            this.firstName = cus.firstName;
            this.lastName = cus.lastName;
            this.emailAddress = cus.emailAddress;
            this.age = cus.age;
            return this;
}
        public Customer build() {

this.id = CustomerGenerator.getInstance().genarateId();
            return new Customer(this);
        }
    }
}
