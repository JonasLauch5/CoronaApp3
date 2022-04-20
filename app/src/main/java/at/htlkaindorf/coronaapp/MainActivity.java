package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btAnmeldung;
    private Button btZertifikate;
    private Button btTickets;
    private String databaseName="Database Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAnmeldung=(Button)findViewById(R.id.id_btAnmeldung);
        btZertifikate=(Button) findViewById(R.id.id_btZertifikate);
        btTickets=(Button) findViewById(R.id.id_btTickets);

        btAnmeldung.setOnClickListener(view-> {Intent intent=new Intent(this,News.class);
                                            startActivity(intent);});
        btZertifikate.setOnClickListener(view -> weiterleitenAufCoronaPassScanner(view));
        btTickets.setOnClickListener(view -> weiterleitenAufSpielseite(view));
    }

    /*
    public void onCreateDatabase()
    {
        SQLiteDatabase sqLiteDatabase = getBaseContext().openOrCreateDatabase(databaseName, MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("CREATE TABLE user(username TEXT,password TEXT,location TEXT)");
        sqLiteDatabase.close();
    }*/

    public void weiterleitenAufAnmeldung(View view)
    {
        Intent intent=new Intent(this,Anmeldung.class);
        startActivity(intent);
    }
    public void weiterleitenAufCoronaPassScanner(View view)
    {
        //Intent intent=new Intent(this,);
        //startActivity(intent);
    }
    public void weiterleitenAufSpielseite(View view)
    {
        Intent intent=new Intent(this,Tickets.class);
        startActivity(intent);
    }

}