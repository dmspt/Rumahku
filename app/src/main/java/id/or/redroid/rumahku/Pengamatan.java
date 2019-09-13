package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pengamatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengamatan);
        Button bClose = (Button) findViewById(R.id.close);

        Button bNext = (Button) findViewById(R.id.next);
        TextView tPengamatan = (TextView) findViewById(R.id.Tpengamatan);
        TextView tPengamatan2 = (TextView) findViewById(R.id.Tpengamatan2);

        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent in = new Intent(Pengamatan.this, Pengamatan2.class);
                startActivity(in);
            }
        });

        Typeface pengamatan = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tPengamatan.setTypeface(pengamatan);

        Typeface pengamatan2 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tPengamatan2.setTypeface(pengamatan2);
    }
}