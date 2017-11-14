package be.eaict.afsprakenvermeylen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bartje on 14-Nov-17.
 */

public class ContactRepository implements IContactRepository {

    public List<Contact> getContacts() {
        List<Contact> contacts = new  ArrayList<Contact>();

        contacts.add(new Contact("Dr. Van Limburgen", R.drawable.contact1));
        contacts.add(new Contact("Dr. Geneens", R.drawable.contact2));
        contacts.add(new Contact("Dr. Cryns", R.drawable.contact3));

        return contacts;
    }
}
