package creational.builder;

public class UserAccount {
    String firstName;
    String lastName;
    String title;
    String dateOfBirth;
    String creditCardNumber;
    String address;
    String accessCode;
    String emailAddress;
    String phoneNumber;
    boolean weekendDelivery;
    static UserBuilder builder()
    {
        return new UserBuilderImp();
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", address='" + address + '\'' +
                ", accessCode='" + accessCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weekendDelivery=" + weekendDelivery +
                '}';
    }

    public void printAccountInfo()
    {
        System.out.println(toString());
    }
}
