package rms.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by s16442932 on 06/04/2017.
 */

public class DepositAdapter extends ArrayAdapter<Deposit>{
    public DepositAdapter (Context context , ArrayList<Deposit> deposits){
        super (context, 0,deposits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Deposit deposit = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_deposit, parent, false);
        }
        // Lookup view for data population
        TextView tvDate = (TextView) convertView.findViewById(R.id.date);
        TextView tvSource = (TextView) convertView.findViewById(R.id.source);
        TextView tvAmount = (TextView) convertView.findViewById(R.id.amount);
        // Populate the data into the template view using the data object
        tvDate.setText(deposit.getDate());
        tvSource.setText(deposit.getSource());
        tvAmount.setText(deposit.getAmount().toString());
        // Return the completed view to render on screen
        return convertView;
    }
}
