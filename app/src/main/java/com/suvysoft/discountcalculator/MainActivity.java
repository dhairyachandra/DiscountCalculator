package com.suvysoft.discountcalculator;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e1, e2;
    TextView t1, t2;
    double x,y,z,x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        e1 = (EditText)findViewById(R.id.cost);
        e2 = (EditText)findViewById(R.id.off);
        t1 = (TextView) findViewById(R.id.res);
        t2 = (TextView) findViewById(R.id.save);
        b = (Button) findViewById(R.id.cal);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(e1.getText().toString());
                y = Double.parseDouble(e2.getText().toString());

                z = (y/100) * x;

                x1 = x - z;

                t2.setText(Double.toString(z));
                t1.setText(Double.toString(x1));


            }
        });

    }

}
