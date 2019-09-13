package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class instruksi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_instruksi);

        TextView tEval = (TextView) findViewById(R.id.Teval);
        TextView tPetunjuk = (TextView) findViewById(R.id.Tpetunjuk);
        TextView tPetunjuk2 = (TextView) findViewById(R.id.Tpetunjuk2);

        Typeface petunjuk = Typeface.createFromAsset(getAssets(), "font/Hansville-Bold.ttf");
        tPetunjuk.setTypeface(petunjuk);

        Typeface petunjuk2 = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        tPetunjuk2.setTypeface(petunjuk2);

        Typeface eval = Typeface.createFromAsset(getAssets(), "font/dealerplatecalifornia.ttf");
        tEval.setTypeface(eval);
    }

    public void next(View view) {
        finish();
        Intent intent = new Intent(instruksi.this, Soal.class);
        startActivity(intent);
    }

    public void close(View view) {
        finish();
    }
}
