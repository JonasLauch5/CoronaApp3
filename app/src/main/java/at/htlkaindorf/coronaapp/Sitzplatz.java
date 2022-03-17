package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sitzplatz extends AppCompatActivity {
    private Button btBezahlen;
    private TextView tvBA;
    private TextView tvfreiePlätze;
    private TextView tvPreis;
    private TextView tvSektor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitzplatz);

        btBezahlen=(Button) findViewById(R.id.id_btBezahlen);

        btBezahlen.setOnClickListener(view -> toQrCodeSide(view));
    }
    public void toQrCodeSide(View view)
    {
        Intent intent=new Intent(this,QRCode.class);
        startActivity(intent);
    }
}