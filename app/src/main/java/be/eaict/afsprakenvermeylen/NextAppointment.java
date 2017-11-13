package be.eaict.afsprakenvermeylen;

import android.widget.TextView;
import java.util.List;

/**
 * Created by Bartje on 12-Nov-17.
 */

public class NextAppointment {

    private List<Appointment> appointments;

    public NextAppointment(List<Appointment> list){
        this.appointments = list;
    }

    private long Low = Long.MAX_VALUE;
    private int LowId = 0;

    private DateFormater Date;

    String getNextAppointment(){
        for (int i = 0; i < this.appointments.size(); i++){
            if (appointments.get(i).getTime() > System.currentTimeMillis()){
                if (Low > appointments.get(i).getTime()){
                    Low = appointments.get(i).getTime();
                    LowId = appointments.get(i).getId() - 1;
                    Date = new DateFormater(appointments.get(LowId).getTime());
                }
            }
        }
        return ("Your next appointment is with " + appointments.get(LowId).getContactName() +
                " at " + Date.getDateFormat("d/M H:mm"));
    }

    public int getLowId() {return LowId;}
}
