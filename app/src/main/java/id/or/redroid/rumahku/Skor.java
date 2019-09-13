package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Skor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar\t : " + Soal.benar + "\nJawaban Salah\t\t : " + Soal.salah);
        nilai.setText("" + Soal.hasil);

        Typeface tHasil = Typeface.createFromAsset(getAssets(), "font/Hansville-Bold.ttf");
        hasil.setTypeface(tHasil);

        Typeface tNilai = Typeface.createFromAsset(getAssets(), "font/BananaSuper.otf");
        nilai.setTypeface(tNilai);
    }

    public void ulangi(View view) {
        finish();
        Intent intent = new Intent(getApplicationContext(), Soal.class);
        startActivity(intent);
    }

    public void close(View view) {
        finish();

    }
}
