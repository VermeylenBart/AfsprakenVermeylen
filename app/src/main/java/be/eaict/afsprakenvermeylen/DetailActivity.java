package be.eaict.afsprakenvermeylen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final AppointmentDummyRepository _Appointments = new AppointmentDummyRepository();
        List<Appointment> appointments = _Appointments.getAppointments();
        int Position = getIntent().getIntExtra("Position", 0);

        TextView textDoctor = (TextView) findViewById(R.id.textDoctor);
        textDoctor.setText(appointments.get(Position).getContactName());

        String Time = appointments.get(Position).getDay() + "/" + appointments.get(Position).getMonth() +
                "/" + appointments.get(Position).getYear() + " " + appointments.get(Position).getHour() +
                ":" + appointments.get(Position).getMinute();

        TextView textTime = (TextView) findViewById(R.id.textTime);
        textTime.setText(Time);

        TextView textLocation = (TextView) findViewById(R.id.textLocation);
        textLocation.setText(appointments.get(Position).getLocation());

        TextView textReason = (TextView) findViewById(R.id.textReason);
        textReason.setText(appointments.get(Position).getReason());
    }
}
