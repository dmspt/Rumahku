package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pengamatan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengamatan2);

        Button bClose = (Button) findViewById(R.id.close);
        Button bBack = (Button) findViewById(R.id.back);
        TextView tPengamatan3 = (TextView) findViewById(R.id.Tpengamatan3);
        TextView tPengamatan4 = (TextView) findViewById(R.id.Tpengamatan4);

        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent in = new Intent(Pengamatan2.this, Pengamatan.class);
                startActivity(in);
            }
        });

        Typeface pengamatan3 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tPengamatan3.setTypeface(pengamatan3);

        Typeface pengamatan4 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tPengamatan4.setTypeface(pengamatan4);
    }
}