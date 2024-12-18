public class Main {
    public static void main(String[] args) {
        System.out.println("library");

        Library library = new Library();
        User admin = UserFactory.createUser("Admin", "Alice");
        admin.performRole();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));
        library.viewBooks();

        // Member Role
        User member = UserFactory.createUser("Member", "Bob");
        member.performRole();
    }
}
