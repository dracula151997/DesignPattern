package creational.builder;

public class BuilderPatternTest {
    public static void main(String[] args) throws Exception {
        UserBuilder builder = UserAccount.builder();
        builder.setFirstName("Hassan")
                .setLastName("Mohammed")
                .setAccessCode("1223")
                .setCreditCardNumber("123456789234678")
                .setDateOfBirth("1997-05-01")
                .build().printAccountInfo();
    }
}
