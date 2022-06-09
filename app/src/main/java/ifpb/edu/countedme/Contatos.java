package ifpb.edu.countedme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Contatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        getSupportActionBar().hide();
    }
}