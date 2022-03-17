package at.htlkaindorf.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Anmeldung extends AppCompatActivity  {
    private Button btRegrestrierung;
    private EditText ptName;
    private EditText ptEmail;
    private EditText ptLocation;
    private String fullName;
    private String email;
    private String location;
    private List cities=new ArrayList<String>();
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anmeldung);
        btRegrestrierung=(Button) findViewById(R.id.id_btRegistrieren);
        btRegrestrierung.setOnClickListener(view -> toGameDisplay(view));
        ptEmail=(EditText) findViewById(R.id.id_ptNummer);
        ptLocation=(EditText) findViewById(R.id.id_ptPasswort);

        cities.add("Steiermark");
        cities.add("Wien");
        cities.add("Burgenland");
        cities.add("Voralberg");
        cities.add("Tirol");
        cities.add("Salzburg");
        cities.add("Oberösterreich");
        cities.add("Niederösterreich");

    }
    public void toGameDisplay(View view) {
        fullName = String.format("" + ptName.getText());
        email = String.format("" + ptEmail.getText());
        location = String.format("" + ptLocation.getText());

        if ((!fullName.equals("")) && (!email.equals("")) && (!location.equals("")) && (email.contains("@"))) {
            for (int i = 0; i < cities.size(); i++) {
                if(cities.get(i).equals(location))
                {
                    count++;
                }
            }
            if(count==0)
            {
                Toast.makeText(this, "Bitte wähle eine Stadt von unserer Liste!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent=new Intent(this,Tickets.class);
                startActivity(intent);
            }
        }
        else
        {
            Toast.makeText(this, "Bitte fuelle alle Felder korrekt aus!!!", Toast.LENGTH_SHORT).show();
        }
    }
}