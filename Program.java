public class Program {
    // Main method for testing
    public static void main(String[] args) {
        // Create a ContactManager object
        ContactManager manager = new ContactManager();

        // Add contacts
        manager.addContact("new Contact" ("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
        manager.addContact("new Contact",("Bob", "bob@example.com", "098-765-4321"));

        // List contacts
        System.out.println("List of Contacts:");
        manager.listContacts();

        // Separator
        System.out.println("------------------------");

        // Remove a contact
        manager.removeContact("Alaadin");
        System.out.println("Alaadin removed.");

        // Separator
        System.out.println("------------------------");

        // List contacts again to see the change
        System.out.println("List of Contacts after removal:");
        manager.listContacts();
    }
}
