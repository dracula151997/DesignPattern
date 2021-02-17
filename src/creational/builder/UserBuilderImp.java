package creational.builder;

public class UserBuilderImp implements UserBuilder {
    private final UserAccount userAccount;

    public UserBuilderImp() {
        userAccount = new UserAccount();
    }

    @Override
    public UserAccount build() throws Exception {
        if (userAccount.accessCode != null && !userAccount.accessCode.isEmpty()) {
            if (userAccount.address == null || userAccount.address.isEmpty())
                throw new Exception();
        }
        return userAccount;
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        userAccount.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        userAccount.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        userAccount.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserBuilder setCreditCardNumber(String creditCardNumber) {
        userAccount.creditCardNumber = creditCardNumber;
        return this;
    }

    @Override
    public UserBuilder setDateOfBirth(String dateOfBirth) {
        userAccount.dateOfBirth = dateOfBirth;
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {
        userAccount.address = address;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        userAccount.emailAddress = email;
        return this;
    }

    @Override
    public UserBuilder setWeekendDelivery(boolean weekendDelivery) {
        userAccount.weekendDelivery = weekendDelivery;
        return this;
    }

    @Override
    public UserBuilder setTitle(String title) {
        userAccount.title = title;
        return this;
    }

    @Override
    public UserBuilder setAccessCode(String accessCode) {
        userAccount.accessCode = accessCode;
        return null;
    }
}
