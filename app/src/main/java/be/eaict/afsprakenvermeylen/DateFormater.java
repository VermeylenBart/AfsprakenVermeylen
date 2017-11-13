package be.eaict.afsprakenvermeylen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Bartje on 13-Nov-17.
 */

public class DateFormater {

    private long timeStamp;

    public DateFormater(long _timeStamp){this.timeStamp=_timeStamp;}

    public String getDateFormat( String formatDate){
        SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
        return sdf.format(new Date(this.timeStamp));
    }

}
