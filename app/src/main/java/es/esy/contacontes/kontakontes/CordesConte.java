package es.esy.contacontes.kontakontes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CordesConte extends AppCompatActivity {
    String nomnen, nomnena, escola, accio; //Creació de les diverses variables
    int j = 1; //Creació varible j, numèrica
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordes_conte);
        final ImageView img = (ImageView) findViewById(R.id.imgcorda2); //Creació dels diferents objectes
        final TextView text1 = (TextView) findViewById(R.id.textcorda1);
        final Button btn = (Button)  findViewById(R.id.passa_btn);

        Bundle Informacio = this.getIntent().getExtras(); //Objecte Bundle que és un conjunt d'informació rebuda de l'anterior activitat
        nomnen = Informacio.getString("Nomnen");
        nomnena = Informacio.getString("Nomnena");
        escola = Informacio.getString("Escola");
        accio = Informacio.getString("Acció");

        img.setImageResource(R.drawable.corda1); //S'estableix primerament la imatge1.
        text1.setText("Hi havia una vegada en el col·legi, una nena molt simpàtica que es deia " + nomnena + ". Tots els nens volien jugar amb ella ja que era molt divertida i tenia un gran cor.");
        btn.setText("Passa");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j == 0){ //S'utilitza condicional per poder passar la vinyeta.
                    img.setImageResource(R.drawable.corda1);
                    btn.setText("Passa");
                    text1.setText("Hi havia una vegada en el col·legi, una nena molt simpàtica que es deia " + nomnena + ". Tots els nens volien jugar amb ella ja que era molt divertida i tenia un gran cor.");
                    j = j + 1;
                }
                else if (j == 1){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda2);
                    btn.setText("Passa");
                    text1.setText("Quan passava pels passadissos, va veure un nen nou a l’escola anomenat " + nomnen + ". Era un nen molt diferent als altres i amb una peculiaritat: no podia caminar.");
                    j = j + 1;
                }
                else if (j == 2){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda3);
                    text1.setText("Quan el va veure, no va pensar en res més que en fer-se amiga del nen nou de l'escola "+ escola +". En canvi, al principi, els altres nens no volien parlar amb ell.");
                    j = j + 1;
                }
                else if (j == 3){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda4);
                    text1.setText("A l’hora de l’esbarjo, el noi també volia jugar com ho feien els altres, però no podia. Al veure-ho, la nena vol parlar amb ell.");
                    j = j + 1;
                } else if (j == 4){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda5);
                    text1.setText("Ella li va pregunta com es deia, però no li va contestar. <<Benvingut al col·legi!>> va dir per trencar l'ambient");
                    j = j + 1;
                } else if (j == 5) {
                    text1.setText("");
                    img.setImageResource(R.drawable.corda6);
                    text1.setText("<<No saps parlar? Ni caminar? Què et passa? Jo, quan vull moure la mà, ho faig així>> va dir la nena");
                    j = j + 1;
                } else if (j ==6 ){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda7);
                    text1.setText("Les amigues de la "+nomnena+" la criden perquè torni a "+ accio +" amb elles. Però la "+ nomnena +" vol jugar a la corda amb el seu nou amic.");
                    j = j +1;
                } else if (j == 7){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda8);
                    text1.setText("La "+nomnena+" està contenta de tenir un nou amic. Ella només vol passar-s’ho molt bé: fent de pirates, ballant un vals, jugant a la pilota, "+accio+"...");
                    j= j + 1;
                }
                else if (j == 8){
                    text1.setText("");
                    img.setImageResource(R.drawable.corda9);
                    text1.setText("Són amics inseparables i això mai canviarà perquè la amistat és una de les coses que et dóna la vida i s’ha d’aprofitar.");
                    j = j + 1;
                } else if (j == 9){
                    text1.setText("");
                    text1.setText("Basat en “Cuerdas”, curtmetratge dirigit per Pedro Solís García i guanyador del premi Goya al millor curtmetratge d’animació.");
                    btn.setText("Torna");
                    j = 0;
                }
            }
        });
    }
}
