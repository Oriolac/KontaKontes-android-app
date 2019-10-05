package es.esy.contacontes.kontakontes.Microrelats;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import es.esy.contacontes.kontakontes.R;

public class Microrelats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microrelats);

        RecyclerView rv = (RecyclerView) findViewById(R.id.MrLista); //Instal·lació del Recyclerew dintre de la classe
        LinearLayoutManager llm = new LinearLayoutManager(this); //Crear un LinearLayout perquè sigui més fàcil la estructura dels ítems de la llista, és el més comú
        rv.setLayoutManager(llm);
        List<MrConte> ListMrConte = Arrays.asList(new MrConte(R.drawable.ic_menu_slideshow,"Com si fes mil anys","Et penso i és com si fes mil anys que ets amb mi, cara a cara, parlant. Com si cadascuna de les paraules que tens, les dugués dintre meu fins i tot abans de trobar-te. Com si cadascuna de les teves músiques dormís a les meves mans i només calgués un únic acord per a desvetllar-les. Com si l'essència de tot plegat es reduís als teus ulls dins dels meus. Osti... estic enamorada."), //Creació de la Llista agafant els diferents paràmetres amb els ítems agafats de MrConte
                new MrConte(R.drawable.ic_menu_slideshow,"Feblesa encoberta","I ell, com que l'estimava tant, la va rebutjar amb l'aigua tèbia de l'odi. I com que la seguia estimant tant, però tant, tant, tant, la va desfer amb l'aigua freda i amarga de la indiferència. I finalment, quan ja no l'estimava, ni tan sols una mica, va descansar: ja ningú el destruiria mai."),
                new MrConte(R.drawable.ic_menu_slideshow,"Olor de taronja","De cop i sense avís m´arriba una olor coneguda, intensa, molt intensa : l´olor de la pell d`una taronja. De seguida intento mirar d´on ve, qui menja una taronja al tren. Allargo la mirada al davant, als costats, darrera… i no veig la persona. Oh! al moment m´adono que és millor que sigui així : estic gaudint lliurement la seva essència. "));
        Adaptador adapter = new Adaptador(ListMrConte); //Creació del adaptador que va lligat al ListMrConte
        rv.setAdapter(adapter); //Establir l'adaptador perquè funcioni
    }
}
