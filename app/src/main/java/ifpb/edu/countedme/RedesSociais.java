package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import ifpb.edu.countedme.controle.ChamadaIntents;

public class RedesSociais extends AppCompatActivity {

    private ImageButton instagram;
    private ImageButton facebook;
    private ImageButton twitter;
    private ChamadaIntents chamada = new ChamadaIntents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes_sociais);
        getSupportActionBar().hide();

        instagram = (ImageButton) findViewById(R.id.btn_instagram);
        twitter = (ImageButton) findViewById(R.id.btn_twitter);
        facebook = (ImageButton) findViewById(R.id.btn_facebook);

        instagram.setOnClickListener(event -> startActivity(chamada.chamadaIntent(false, "https://www.instagram.com")));
        twitter.setOnClickListener(event -> startActivity(chamada.chamadaIntent(false, "https://www.twitter.com")));
        facebook.setOnClickListener(event -> startActivity(chamada.chamadaIntent(false, "https://www.facebook.com")));

    }
}