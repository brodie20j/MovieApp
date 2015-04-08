package com.example.cody.moviedatabase;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import android.app.ListActivity;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listItems = new ArrayList<String>();
        listItems.add("Home (2015)");
        listItems.add("Get Hard (2015)");
        listItems.add("Insurgent (2015)");
        listItems.add("Cinderella (2015)");
        listItems.add("It Follows (2015)");
        listItems.add("Kingsman: The Secret Service (2015)");
        listItems.add("Do You Believe? (2015)");
        listItems.add("Run All Night (2015)");
        listItems.add("The Second Best Exotic Marigold Hotel (2015)");
        listItems.add("The Gunman (2015)");

        ListDemoAdapter adapter = new ListDemoAdapter(this, R.layout.list_cell, listItems);
        ListView listView = (ListView)this.findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == R.id.action_web) {
            Intent intent = new Intent(this, Web.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }
        if(id == R.id.action_About) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }
        if(id == R.id.action_info) {
            Intent intent = new Intent(this, Info.class);
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
            return true;
        }

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View view) {

    }

    /**
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case MainActivity.COW_REQUEST_CODE:
                if (resultCode == RESULT_OK) {
                    String cowName = data.getStringExtra(MainActivity.COW_NAME_KEY);
                    String message = "The cow's name is '" + cowName + "'";
                    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
        }
    } */
}
