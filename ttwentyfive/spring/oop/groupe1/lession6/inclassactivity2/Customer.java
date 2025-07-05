package ttwentyfive.spring.oop.groupe1.lession6.inclassactivity2;

public class Customer {
    private String fullName;
    private String customerId;

    public Customer(String fullName, String customerId) {
        this.fullName = fullName;
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCustomerId() {
        return customerId;
    }
}

