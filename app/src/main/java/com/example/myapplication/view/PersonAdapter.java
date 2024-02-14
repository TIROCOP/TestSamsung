package com.example.myapplication.view;

import android.app.ListActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myapplication.R;
import com.example.myapplication.domain.Person;
import com.example.myapplication.recycler.DoggyAdapter;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, Person[] arr) {
        super(context, R.layout.item_person, arr);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, null);
        }

        assert person != null;
        ((TextView) convertView.findViewById(R.id.tv_name)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.tv_phNum)).setText(person.phone);


        return convertView;
    }
}
