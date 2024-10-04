import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonManager {

    public static void writeToJson(ContactList contactList, String filePath) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(contactList.getContactList(), writer);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ContactList readFromJson(String filePath) throws IOException {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filePath)) {
            Type contactListType = new TypeToken<List<Person>>() {}.getType();
            List<Person> contacts = gson.fromJson(reader, contactListType);
            ContactList contactList = new ContactList();
            for (Person person : contacts) {
                contactList.addContact(person);
            }
            return contactList;
        }
    }
}
