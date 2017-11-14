package be.eaict.afsprakenvermeylen;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bartje on 14-Nov-17.
 */

public class ContactRepository implements IContactRepository {



    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Dr. Van Limburgen", R.drawable.contact1));
        contacts.add(new Contact("Dr. Geneens", R.drawable.contact2));
        contacts.add(new Contact("Dr. Cryns", R.drawable.contact3));

        return contacts;
    }

    public int getImage(String contactNameIn) {
        List<Contact> _contacts = getContacts();
        int Image = R.drawable.clock_icon;

        for (int i = 0; i < _contacts.size(); i++) {
            if (contactNameIn == _contacts.get(i).getContactName()) {
               Image = _contacts.get(i).getContactImage();
            }
        }

        return Image;
    }
}
