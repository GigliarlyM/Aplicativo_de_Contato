package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BemVindo extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        getSupportActionBar().hide();

        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(event -> {
            Intent intent = new Intent(this, MenuPrincipal.class);

            startActivity(intent);
        });
    }
}