package rms.listviewsample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Deposit> arryListDeposit= new ArrayList<Deposit>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        ArrayList<Deposit> arrayOfUsers = new ArrayList<Deposit>();
        // Create the adapter to convert the array to views
        DepositAdapter adapter = new DepositAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvDeposits);
        listView.setAdapter(adapter);


        // Add item to adapter
        Deposit newUser = new Deposit("1","Nathan", "San Diego","3232.2");
        adapter.add(newUser);
        Deposit newUser1 = new Deposit("2","Some", "San Diego","52.3");
        adapter.add(newUser1);

    }




}
