package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tickets extends AppCompatActivity implements View.OnClickListener {
    private Button btSpiel1;
    private Button btSpiel2;
    private Button btSpiel3;
    private Button btSpiel4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);
        btSpiel1=(Button) findViewById(R.id.id_btSpiel1);
        btSpiel2=(Button)findViewById(R.id.id_btSpiel2);
        btSpiel3=(Button)findViewById(R.id.id_btSpiel3);
        btSpiel4=(Button)findViewById(R.id.id_btSpiel4);

        btSpiel1.setOnClickListener(this);
        btSpiel2.setOnClickListener(this);
        btSpiel3.setOnClickListener(this);
        btSpiel4.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,Sitzplatz.class);
        startActivity(intent);
    }
}