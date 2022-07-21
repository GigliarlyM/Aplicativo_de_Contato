package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ifpb.edu.countedme.controle.ChamadaIntents;

public class EnvioEmail extends AppCompatActivity {

    private EditText emailDestino;
    private EditText emailTexto;
    private Button emailEnviar;
    private ChamadaIntents chamada = new ChamadaIntents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio_email);
        getSupportActionBar().hide();

        emailDestino = (EditText) findViewById(R.id.email_destino);
        emailTexto = (EditText) findViewById(R.id.email_texto);

        emailEnviar = (Button) findViewById(R.id.email_enviar);

        emailEnviar.setOnClickListener(event -> startActivity(chamada.chamadaIntent(
                true,
                emailTexto.getText().toString())
        ));

    }
}