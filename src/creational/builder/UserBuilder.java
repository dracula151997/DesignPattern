package creational.builder;

public interface UserBuilder {
    UserAccount build() throws Exception;

    UserBuilder setFirstName(String firstName);

    UserBuilder setLastName(String lastName);

    UserBuilder setPhoneNumber(String phoneNumber);

    UserBuilder setCreditCardNumber(String creditCardNumber);

    UserBuilder setDateOfBirth(String dateOfBirth);

    UserBuilder setAddress(String address);

    UserBuilder setEmail(String email);

    UserBuilder setWeekendDelivery(boolean weekendDelivery);

    UserBuilder setTitle(String title);

    UserBuilder setAccessCode(String accessCode);

}
