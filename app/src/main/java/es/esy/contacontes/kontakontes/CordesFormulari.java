package es.esy.contacontes.kontakontes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CordesFormulari extends AppCompatActivity {
    EditText Nomnen, Nomnena, Escola, Accio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordes_formulari);
        Nomnen = (EditText) findViewById(R.id.fld_nommprota);
        Nomnena = (EditText) findViewById(R.id.fld_nomfprota);
        Escola = (EditText) findViewById(R.id.fld_escola);
        Accio = (EditText) findViewById(R.id.fld_accio);
        final Button envia = (Button) findViewById(R.id.btn_enviacordes);
        envia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnviarDades();
            }
        });
    }

    private void EnviarDades(){
        String nomnen, nomnena, escola, accio;
        nomnen = Nomnen.getText().toString();
        nomnena = Nomnena.getText().toString();
        escola = Escola.getText().toString();
        accio = Accio.getText().toString();
        Intent Variables = new Intent(CordesFormulari.this, CordesConte.class);
        Variables.putExtra("Nomnen", nomnen);
        Variables.putExtra("Nomnena", nomnena);
        Variables.putExtra("Escola", escola);
        Variables.putExtra("Acció", accio);
        startActivity(Variables);
    }
}
