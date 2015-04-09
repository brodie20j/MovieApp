package com.example.cody.moviedatabase;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.app.ListActivity;
import android.widget.Spinner;



public class MainActivity extends ListActivity {
    private final String infoString="Information";
    private final String trailerString="Movie Trailer";
    private final String reviewString="Reviews";
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listItems = new ArrayList<String>();
        listItems.add(this.infoString);
        listItems.add(this.trailerString);
        listItems.add(this.reviewString);

        ListDemoAdapter adapter = new ListDemoAdapter(this, R.layout.list_cell, listItems);
        ListView listView = (ListView) this.findViewById(android.R.id.list);
        listView.setAdapter(adapter);
        this.spinner=(Spinner)findViewById(R.id.spinner);
        this.spinner.setOnItemSelectedListener(new SpinnerListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_About) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    private String getCurrentMovie() {
        return String.valueOf(spinner.getSelectedItem());
    }
    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {
        TextView textView = (TextView)v.findViewById(R.id.listCellTextView);

        Intent newIntent;
        System.out.println(":(");
        if (textView.getText().equals(this.trailerString)) {
            System.out.println("foo");
            newIntent=new Intent(this, TrailerActivity.class);
            System.out.println(this.getCurrentMovie());
            newIntent.putExtra(TrailerActivity.RAW_NAME,this.getCurrentMovie());
        }
        else {
            Toast toast = Toast.makeText(v.getContext(), textView.getText(), Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        startActivity(newIntent);
        overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
    }

}
