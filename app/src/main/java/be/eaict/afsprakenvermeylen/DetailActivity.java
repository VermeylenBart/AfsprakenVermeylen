package be.eaict.afsprakenvermeylen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final List<Appointment> appointments = (new AppointmentDummyRepository()).getAppointments();
        final int Position = getIntent().getIntExtra("Position", 0);

        ContactRepository _Contacts = new ContactRepository();

        TextView textDoctor = (TextView) findViewById(R.id.textDoctor);
        textDoctor.setText(appointments.get(Position).getContactName());

        TextView textTime = (TextView) findViewById(R.id.textTime);
        textTime.setText(appointments.get(Position).getFormatedTIme("d/M/yyyy HH:mm"));

        TextView textLocation = (TextView) findViewById(R.id.textLocation);
        textLocation.setText(Html.fromHtml("<u>" + appointments.get(Position).getLocation() + "</u>"));

        LinearLayout linkLocation = (LinearLayout) findViewById(R.id.LocationLink);

        linkLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + (appointments.get(Position).getLocation()).replaceAll("[0-9.]", ""));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        TextView textReason = (TextView) findViewById(R.id.textReason);
        textReason.setText(appointments.get(Position).getReason());

        ImageView imagePerson = (ImageView) findViewById(R.id.detailFace);
        imagePerson.setImageResource(_Contacts.getImage(appointments.get(Position).getContactName()));
    }
}
