package be.eaict.afsprakenvermeylen;

import android.media.Image;

/**
 * Created by Bartje on 14-Nov-17.
 */

public class Contact {
    private String ContactName;
    private int ContactImage;

    public Contact(String contactName, int contactImage){this.ContactName = contactName; this.ContactImage = contactImage;}

    public String getContactName(){return ContactName;}

    public int getContactImage() {return ContactImage;}
}
