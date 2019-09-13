package id.or.redroid.rumahku;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button btnMute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKompetensi = (Button) findViewById(R.id.btn_kompetensi);
        Button btnMateri = (Button) findViewById(R.id.btn_materi);
        Button btnEvaluasi = (Button) findViewById(R.id.btn_evaluasi);
        btnMute = (Button) findViewById(R.id.btn_mute);
        Button btnBantuan = (Button) findViewById(R.id.btn_bantuan);
        Button btnInfo = (Button) findViewById(R.id.btn_info);

        mp = MediaPlayer.create(this, R.raw.chimez);
        mp.setLooping(true);
        mp.setVolume(1, 1);
        mp.start();

        btnKompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kompetensi.class);
                startActivity(intent);
            }
        });

        btnMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Materi.class);
                startActivity(intent);
            }
        });

        btnEvaluasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, instruksi.class);
                startActivity(intent);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentinfo, new Info()).addToBackStack(null).commit();
            }
        });


        btnMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                    btnMute.setBackgroundResource(R.drawable.unmute);
                } else {
                    mp.start();
                    btnMute.setBackgroundResource(R.drawable.mute);
                }
            }
        });

        btnBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bantuan.class);
                startActivity(intent);
            }
        });

    }

    public void evaluasi(View view) {
        Intent intent = new Intent(MainActivity.this, instruksi.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa Anda ingin keluar dari aplikasi ini?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                        mp.stop();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

}
