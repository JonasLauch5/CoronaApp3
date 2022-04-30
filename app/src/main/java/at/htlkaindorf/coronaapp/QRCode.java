package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QRCode extends AppCompatActivity {
    private Button bt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        bt_back=(Button) findViewById(R.id.id_btBack);

        bt_back.setOnClickListener(view -> {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}