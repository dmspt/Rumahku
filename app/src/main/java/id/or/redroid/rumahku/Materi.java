package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        Button membaca = (Button) findViewById(R.id.Bmembaca);
        Button bernyanyi = (Button) findViewById(R.id.Bbernyanyi);
        Button pengamatan = (Button) findViewById(R.id.BPengamatan);
        TextView materi = (TextView) findViewById(R.id.TpilMat);

        membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Membaca.class);
                startActivity(intent);
            }
        });


        bernyanyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Bernyanyi.class);
                startActivity(intent);
            }
        });

        pengamatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Pengamatan.class);
                startActivity(intent);
            }
        });

        Typeface tPilMat = Typeface.createFromAsset(getAssets(), "font/dealerplatecalifornia.ttf");
        materi.setTypeface(tPilMat);

    }

    public void close(View view) {
        super.onBackPressed();
    }
}
