package be.eaict.afsprakenvermeylen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppointmentDummyRepository _Appointments = new AppointmentDummyRepository();
        final NextAppointment nextAppointmentData = new NextAppointment(_Appointments.getAppointments());

        TextView nextAppointment = (TextView) findViewById(R.id.nextAppointment);
        nextAppointment.setText(nextAppointmentData.getNextAppointment());

        nextAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreen(nextAppointmentData.getLowId());
            }
        });

        ListView appointmentList = (ListView) findViewById(R.id.appointmentList);
        appointmentList.setAdapter(new AppointmentAdapter(this, _Appointments.getAppointments()));
        appointmentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                nextScreen(i);
            }
        });

    }

    private void nextScreen(int position){
        Intent i = new Intent(MainActivity.this, DetailActivity.class);
        i.putExtra("Position", position);
        startActivity(i);
    }
}
