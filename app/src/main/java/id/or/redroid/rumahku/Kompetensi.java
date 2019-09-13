package id.or.redroid.rumahku;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kompetensi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompetensi);

        Button bClose = (Button) findViewById(R.id.close);
        TextView tkompetensi = (TextView) findViewById(R.id.Tkompetensi);
        TextView tKD = (TextView) findViewById(R.id.TKD);
        TextView tKomp1 = (TextView) findViewById(R.id.Tkompetensi1);
        TextView tKomp2 = (TextView) findViewById(R.id.Tkompetensi2);
        TextView tKomp3 = (TextView) findViewById(R.id.Tkompetensi3);
        TextView tKomp4 = (TextView) findViewById(R.id.Tkompetensi4);
        TextView tKomp5 = (TextView) findViewById(R.id.Tkompetensi5);


        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kompetensi.super.onBackPressed();
            }
        });

        Typeface custom = Typeface.createFromAsset(getAssets(), "font/Hansville-BoldItalic.ttf");
        tKD.setTypeface(custom);

        Typeface custom1 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tKomp1.setTypeface(custom1);

        Typeface custom2 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tKomp2.setTypeface(custom2);

        Typeface custom3 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tKomp3.setTypeface(custom3);

        Typeface custom4 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tKomp4.setTypeface(custom4);

        Typeface custom5 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tKomp5.setTypeface(custom5);

        Typeface kompetensi = Typeface.createFromAsset(getAssets(), "font/dealerplatecalifornia.ttf");
        tkompetensi.setTypeface(kompetensi);

    }

}
