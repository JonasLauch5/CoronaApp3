package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btLogin2;
    private Button btTickets;
    private Button btNews;
    private String databaseName="Database Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLogin2=(Button)findViewById(R.id.id_btLogin2);
        //btZertifikate=(Button) findViewById(R.id.id_btZertifikate);
        btTickets=(Button) findViewById(R.id.id_btTickets);
        btNews=(Button)findViewById(R.id.id_btNews);

        btTickets.setOnClickListener(view -> {Intent intent=new Intent(this,Tickets.class);
            startActivity(intent);});
        btLogin2.setOnClickListener(view -> {Intent intent=new Intent(this, Login.class);
            startActivity(intent);});
        btNews.setOnClickListener(view -> {Intent intent=new Intent(this, News.class);
            startActivity(intent);});
    }

}