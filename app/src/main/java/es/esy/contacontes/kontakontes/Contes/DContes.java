package es.esy.contacontes.kontakontes.Contes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.esy.contacontes.kontakontes.R;

public class DContes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcontes);

        Button btn_rateta = (Button) findViewById(R.id.btn_rateta);
        Button btn_patufet = (Button) findViewById(R.id.btn_patufet);
        Button btn_porquets = (Button) findViewById(R.id.btn_porquets);
        Button btn_caputxeta = (Button) findViewById(R.id.btn_caputxeta);
        Button btn_llopet = (Button) findViewById(R.id.btn_llopet);
        Button btn_pastoret = (Button) findViewById(R.id.btn_pastoret);

        btn_rateta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 1;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);
            }
        });

        btn_patufet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 2;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);

            }
        });

        btn_porquets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 3;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);
            }
        });

        btn_caputxeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 4;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);
            }
        });

        btn_llopet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 5;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);
            }
        });

        btn_pastoret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numboto = 6;
                Intent StartActivity = new Intent(getApplicationContext(), VisualitzacioConte.class);
                StartActivity.putExtra("numboto", numboto);
                startActivity(StartActivity);
            }
        });
    }
}
