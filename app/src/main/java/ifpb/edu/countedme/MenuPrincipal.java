package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
    Button btnRedeSocial, btnContato, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        getSupportActionBar().hide();

        btnRedeSocial = findViewById(R.id.btn_redes_sociais);
        btnContato = findViewById(R.id.btn_contato);
        btnEmail = findViewById(R.id.btn_email);

        btnRedeSocial.setOnClickListener(event -> escolhaTela("RedesSociais"));
        btnContato.setOnClickListener(event -> escolhaTela("Contatos"));
        btnEmail.setOnClickListener(event -> escolhaTela("Emial"));
    }

    private void escolhaTela(String tela){
        Intent intent;

        switch (tela){
            case "RedesSociais":
                intent = new Intent(this, RedesSociais.class);
                startActivity(intent);
                break;
            case "Contatos":
                intent = new Intent(this, Contatos.class);
                startActivity(intent);
                break;
            case "Emial":
                intent = new Intent(this, EnvioEmail.class);
                startActivity(intent);
                break;
        }
    }

}