package be.eaict.afsprakenvermeylen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        List<Appointment> appointments = (new AppointmentDummyRepository()).getAppointments();
        int Position = getIntent().getIntExtra("Position", 0);

        ContactRepository _Contacts = new ContactRepository();

        TextView textDoctor = (TextView) findViewById(R.id.textDoctor);
        textDoctor.setText(appointments.get(Position).getContactName());

        TextView textTime = (TextView) findViewById(R.id.textTime);
        textTime.setText(appointments.get(Position).getFormatedTIme("d/M/yyyy HH:mm"));

        TextView textLocation = (TextView) findViewById(R.id.textLocation);
        textLocation.setText(appointments.get(Position).getLocation());

        TextView textReason = (TextView) findViewById(R.id.textReason);
        textReason.setText(appointments.get(Position).getReason());

        ImageView imagePerson = (ImageView) findViewById(R.id.detailFace);
        imagePerson.setImageResource(_Contacts.getImage(appointments.get(Position).getContactName()));
    }
}
