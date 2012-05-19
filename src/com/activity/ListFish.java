package com.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ListFish extends ListActivity
{
    public final String[] FISH = new String[]{"Nemo","Crocodile fish","Stingray","Devil Fish","Blow fish"};

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_fish,FISH));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
