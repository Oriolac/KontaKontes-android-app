package es.esy.contacontes.kontakontes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Crea.OnFragmentInteractionListener, Descobreix.OnFragmentInteractionListener, Informacio1.OnFragmentInteractionListener {

    Fragment fragment = null;
    boolean FragmentTransaction = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout); //Creació objecte Navigation Drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        fragment = new Informacio1(); //Creació del fragment principal
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_navigation_drawer, fragment)
                .commit();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() { //Si tires endarrere marxarà el Navigation Drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }


    public static class FragmentDescobreix extends Fragment { //Classe del NavigationDrawer
        public static FragmentDescobreix newInstance(int Drawer) {
            return null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_informacio){ //Depnent de la id, que és l'objecte que es pitxa (Descobreix, informacio, crea..), passarà una cosa o una altra
            fragment = new Informacio1();
            FragmentTransaction = true; // Anirem a Informació


        } else if (id == R.id.nav_crea ) {
            fragment = new Crea(); //Anirema  Crea
            FragmentTransaction = true;


        } else if (id == R.id.nav_descobreix) {
            fragment = new Descobreix(); //Anirem a Descobreix
            FragmentTransaction = true;


        }  else if (id == R.id.nav_send) {
            //Context ToastContext = getApplicationContext(); Utilitzat quan pensava que no podria crear un Intent cap a un correu
            //Toast.makeText(ToastContext, "Funció no disponible", Toast.LENGTH_SHORT).show();
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("plain/text"); //especifica quin tipus d'aplicació pot fer això
            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"kontakontes@gmail.com"}); // el 'to' o destinatari del correu
            emailIntent .putExtra(android.content.Intent.EXTRA_TEXT, "Aquí hi ha el meu suggeriment, opinió o notificació d'error:"); // el cos del correu
            startActivity(Intent.createChooser(emailIntent, "Enviar e-mail"));
        }

        if (FragmentTransaction) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_navigation_drawer, fragment) //Quan Fragment transaction sigui 1 (veritat),
                    .commit();
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle()); //Es canvia el títol de la barra superior.
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
