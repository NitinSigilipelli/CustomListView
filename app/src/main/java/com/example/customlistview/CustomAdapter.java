package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountriesModelClass> {
    //declaration
    private ArrayList<CountriesModelClass> countryArrayList;
    Context context;
    //constructor
    public  CustomAdapter(ArrayList<CountriesModelClass> data, Context context) {
        super(context,R.layout.custom_list_layout,data);
         this.countryArrayList = data;
         this.context = context;
    }
    //view Lookup cache
    private static class ViewHolder{
        TextView txtCountry;
        TextView txtCupWins;
        ImageView flagImg;
}
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        CountriesModelClass dataModel =getItem(position);
        // Check if an existing view is being reused,otherwise inflate the view
        ViewHolder viewHolder ;

        final View result;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from((getContext()));
            convertView = inflater.inflate(
                    R.layout.custom_list_layout,
                    parent,
                    false
            );
            viewHolder.txtCountry = (TextView) convertView.findViewById(R.id.country_name);
            viewHolder.txtCupWins = (TextView) convertView.findViewById(R.id.cups_win);
            viewHolder.flagImg = (ImageView) convertView.findViewById(R.id.countryFlag);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        //Get the data from the model class
        viewHolder.txtCountry.setText(dataModel.getCountries_name());
        viewHolder.txtCupWins.setText(dataModel.getCups_win_count());
        viewHolder.flagImg.setImageResource(dataModel.getFlag_img());
        return convertView;
    }
}
