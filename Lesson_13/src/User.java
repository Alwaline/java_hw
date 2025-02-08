import java.util.Objects;

public class User {

    private final String firstName;
    private final String lastName;
    private final String documentIdNumber;

    private final String citizen;

    public User(String firstName, String lastName, String documentIdNumber, String citizen) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentIdNumber = documentIdNumber;
        this.citizen = citizen;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentIdNumber() {
        return documentIdNumber;
    }

    public String getCitizen() {
        return citizen;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentIdNumber='" + documentIdNumber + '\'' +
                ", citizen='" + citizen + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User that = (User) o;
//        if (!Objects.equals(firstName, that.firstName)) return false;
//        if (!Objects.equals(lastName, that.lastName)) return false;
//        return Objects.equals(documentIdNumber, that.documentIdNumber);
//    }
//
//    @Override
//    public int hashCode() {
//        int hash1 = firstName.hashCode();
//        int hash2 = lastName.hashCode();
//        int hash3 = documentIdNumber.hashCode();
//        int hash4 = citizen.hashCode();
//
//        return hash1 + hash2 + hash3 + hash4;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(documentIdNumber, user.documentIdNumber);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(documentIdNumber);
        return result;
    }
}
