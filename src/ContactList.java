import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactList {
    private List<Person> contactList;

    public ContactList() {
        this.contactList= new ArrayList<>();
    }
    // add person to contact list
    public void addContact(Person person) {
        contactList.add(person);
    }
    // search by name
    public void searchByName(String name) {
        List<Person> searchResult =  contactList.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
        for(Person person: searchResult) {
            person.getDetailsOfPerson();
        }
    }
    //search by phone
    public List<Person> searchByPhone(String phone) {
        return contactList.stream().filter(person -> person.getName().equals(phone)).collect(Collectors.toList());
    }
    // print contact list
    public void printContactList() {
        for(Person person : contactList){
           person.getDetailsOfPerson();
        }
    }
    public List<Person> getContactList() {
        return contactList;
    }
}
