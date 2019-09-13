package id.or.redroid.rumahku;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Soal extends AppCompatActivity {

    ImageView gambar;
    TextView quis;
    RadioGroup radiogroup;
    RadioButton pilihA, pilihB, pilihC, pilihD;
    int nomor = 0;
    public static int hasil, benar, salah;

    String[] pertanyaan = new String[]{
            " 2+2+2 dapat pula ditulis ….",
            " Dua kelompok anak bermain lompat tali.\n Setiap kelompok terdiri atas 5 anak.\n Kalimat perkaliannya adalah: ..... X .....",
            " Terbuat dari apa simpai tersebut?",
            " Bagaimana bentuk simpai itu?",
            " Bagaimana cara memainkan perahu kertas?",
            " Lengkapi kalimat berikut \n Sebelum berangkat ke sekolah aku…..terlebih dahulu",
            " Butuh berapa kertas untuk membuat sebuah perahu kertas mainan?",
            " Jika ingin pintar maka harus ....\n",
            " 1. Meletakkan tas di tempatnya\n 2. Mencuci tangan\n 3. Membersihkan meja makan\n 4. Makan\n 5. Mencuci tangan kembali\n Urutkan kegiatan-kegiatan diatas dengan benar ",
            " Bagaimana bentuk air jika dipindahkan ke dalam botol? ",

    };
    String[] pilih_jawaban = new String[]{
            "2x3", "2x2", "2x4", "2x5",
            "lima X lima", "lima X tiga", "dua X lima", "tiga X tiga",
            "daun", "rotan", "batang pohon", "ranting pohon",
            "segitiga", "persegi panjang", "persegi", "lingkaran",
            "diapungkan di atas air", "dilemparkan", "diterbangkan", "digulingkan",
            "Mencuci pakaiann", "Sarapan pagi", "Bermain di taman", "Menjenguk teman",
            "3 kertas", "6 kertas", "1 kertas", "2 kertas",
            "Menonton tv setiap hari", "Membaca buku setiap waktu", "Bermain bersama teman", "Makan makanan 4 sehat 5 sempurna",
            "2-4-3-1-5", "1-2-4-3-5", "4-3-5-2-1", " 3-5-2-1-4",
            "berbentuk bulat", "berbentuk seperti botol", "berbentuk seperti meja", "berbentuk persegi",

    };
    String[] jawaban_benar = new String[]{
            "2x3",
            "dua X lima",
            "rotan",
            "lingkaran",
            "diapungkan di atas air",

            "Sarapan pagi",
            "1 kertas",
            "Membaca buku setiap waktu",
            "1-2-4-3-5",
            "berbentuk seperti botol",
    };
    Integer[] Images = new Integer[]{
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.satu,
            R.drawable.dua,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        quis = (TextView) findViewById(R.id.quis);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        pilihA = (RadioButton) findViewById(R.id.pilihA);
        pilihB = (RadioButton) findViewById(R.id.pilihB);
        pilihC = (RadioButton) findViewById(R.id.pilihC);
        pilihD = (RadioButton) findViewById(R.id.pilihD);
        gambar = (ImageView) findViewById(R.id.iv_gambar);

        radiogroup.check(0);
        benar = 0;
        salah = 0;

        quis.setText(pertanyaan[nomor]);
        pilihA.setText(pilih_jawaban[0]);
        pilihB.setText(pilih_jawaban[1]);
        pilihC.setText(pilih_jawaban[2]);
        pilihD.setText(pilih_jawaban[3]);
        gambar.setImageResource(Images[nomor]);

        Typeface tSoal = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        quis.setTypeface(tSoal);

        Typeface tPilA = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        pilihA.setTypeface(tPilA);

        Typeface tPilB = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        pilihB.setTypeface(tPilB);

        Typeface tPilC = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        pilihC.setTypeface(tPilC);

        Typeface tPilD = Typeface.createFromAsset(getAssets(), "font/Hansville.ttf");
        pilihD.setTypeface(tPilD);

    }

    public void next(View view) {
        if (pilihA.isChecked() || pilihB.isChecked() || pilihC.isChecked() || pilihD.isChecked()) {
            RadioButton jawaban_user = (RadioButton) findViewById(radiogroup.getCheckedRadioButtonId());
            String ambil_jawaban = jawaban_user.getText().toString();
            radiogroup.check(0);
            if (ambil_jawaban.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan.length) {
                quis.setText(pertanyaan[nomor]);
                pilihA.setText(pilih_jawaban[(nomor * 4) + 0]);
                pilihB.setText(pilih_jawaban[(nomor * 4) + 1]);
                pilihC.setText(pilih_jawaban[(nomor * 4) + 2]);
                pilihD.setText(pilih_jawaban[(nomor * 4) + 3]);
                gambar.setImageResource(Images[nomor]);

            } else {
                hasil = benar * 10;
                finish();
                Intent selesai = new Intent(getApplicationContext(), Skor.class);
                startActivity(selesai);
            }
        } else {
            Toast.makeText(this, "Pilih Jawabanmu!", Toast.LENGTH_SHORT).show();
        }
    }

}
