package com.example.cody.moviedatabase;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Info extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        /**InputStream iS = getResources().getAssets().open("movies.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(iS));

        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<Integer> times = new ArrayList<Integer>();
        ArrayList<String> descriptions = new ArrayList<String>();

        try {
            //StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                String[] parts = line.split("|");
                titles.add(parts[0]);
                times.add((Integer.valueOf(parts[1])));
                descriptions.add(parts[2]);
                line = reader.readLine();
            }
            //String everything = sb.toString();
        } finally {
            reader.close();
        }
    **/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == R.id.action_main) {
            this.finish();
            return true;
        }
        if(id == R.id.action_web) {
            this.finish();
            Intent intent = new Intent(this, Web.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }
        if(id == R.id.action_About) {
            this.finish();
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }
        if(id == R.id.action_info) {
            this.finish();
            Intent intent = new Intent(this, Info.class);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }


}
