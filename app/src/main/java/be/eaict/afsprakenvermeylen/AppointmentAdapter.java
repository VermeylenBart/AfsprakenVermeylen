package be.eaict.afsprakenvermeylen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Bartje on 13-Nov-17.
 */

public class AppointmentAdapter extends ArrayAdapter<Appointment> {



    public AppointmentAdapter(Context context, List<Appointment> list) {
        super(context, -1, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_list_items, null);
        DateFormater Date = new DateFormater(getItem(position).getTime());

        TextView textDate = (TextView) view.findViewById(R.id.listDate);
        textDate.setText(Date.getDateFormat("dd/MM/yyyy"));

        TextView textTime = (TextView) view.findViewById(R.id.listTime);
        textTime.setText(Date.getDateFormat("HH:mm"));

        TextView textDoctor = (TextView) view.findViewById(R.id.listDoctor);
        textDoctor.setText(getItem(position).getContactName());

        TextView textLocation = (TextView) view.findViewById(R.id.listLocation);
        textLocation.setText(getItem(position).getLocation());

        return view;
    }
}
