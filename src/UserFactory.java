public class UserFactory {
    public static User createUser(String type, String name) {
        if ("Member".equals(type)) {
            return new Member(name);
        } else if ("Admin".equals(type)) {
            return new Admin(name);
        }

        throw new IllegalArgumentException("Invalid user type");
    }
}
