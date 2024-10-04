
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("john",17,"example@gmail.com","04111111","vaasa, Finland");
        Person person2 = new Person("lucy",22,"hello@gmail.com","04188888","vamk, Finland");

        ContactList contactList = new ContactList();

        contactList. addContact(person1);
        contactList. addContact(person2);

        System.out.println("This is your search result: ");
        contactList.searchByName("john");
        System.out.println();

        JsonManager.writeToJson(contactList, "contacts.json");

        ContactList loadedContacts = JsonManager.readFromJson("contacts.json");
        System.out.println("Here you get all the contacts: ");
        loadedContacts.printContactList();
    }//end main
}