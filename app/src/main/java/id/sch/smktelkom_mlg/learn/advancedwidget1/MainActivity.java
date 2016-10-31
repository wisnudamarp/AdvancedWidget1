package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

        final EditText etNama = new EditText(this);
        etNama.setHint("Isikan Nama Anak");
        llMain.addView(etNama);

        final EditText etUmur = new EditText(this);
        etUmur.setHint("Isikan Umur Anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
        llMain.addView(etUmur);

        Button bProses = new Button(this);
        bProses.setText("Proses");
        llMain.addView(bProses);
        final TextView tvHasil = new TextView(this);
        llMain.addView(tvHasil);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvHasil.setText(nama +" umur "+umur+" tahun");
            }
        });
    }
}
