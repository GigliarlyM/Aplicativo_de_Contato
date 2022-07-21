package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import ifpb.edu.countedme.controle.ChamadaIntents;

public class Contatos extends AppCompatActivity {

    TextView contato1;
    private ChamadaIntents chamada = new ChamadaIntents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        getSupportActionBar().hide();

        contato1 = (TextView) findViewById(R.id.contato1);

        contato1.setOnClickListener(event -> startActivity(chamada.chamadaIntent(false,"tel:996344276")));

    }

}