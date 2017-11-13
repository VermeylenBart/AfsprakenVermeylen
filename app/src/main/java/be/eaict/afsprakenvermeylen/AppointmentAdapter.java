package be.eaict.afsprakenvermeylen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
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

        TextView textDate = (TextView) view.findViewById(R.id.listDate);
        textDate.setText(dateFormat(getItem(position).getTime(),"dd/MM/yyyy"));

        TextView textDoctor = (TextView) view.findViewById(R.id.listInfo);
        textDoctor.setText(getItem(position).getContactName());

        return view;
    }

    private String dateFormat(long timeStamp, String formatDate){
        SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
        Date resultdate = new Date(timeStamp);
        return sdf.format(resultdate);
    }
}
