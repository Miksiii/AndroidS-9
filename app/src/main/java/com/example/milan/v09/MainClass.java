package com.example.nikola.v09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by milan on 6/16/2016.
 */
public class MainClass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final   EditText lat = (EditText)findViewById(R.id.editText);
        final EditText lon = (EditText)findViewById(R.id.editText2);


        Button showMap = (Button)findViewById(R.id.button);
        showMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String latitude = lat.getText().toString();
                String longitude = lon.getText().toString();

                Intent i = new Intent(getApplicationContext(), MapsActivity.class);

                // ne prenosi se dobro double vrednost iz editBoxa
                i.putExtra("lat",latitude);
                i.putExtra("lon", longitude);
                startActivity(i);



            }
        });
    }


}
