package es.esy.contacontes.kontakontes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.esy.contacontes.kontakontes.Microrelats.Microrelats;


public class Inici extends AppCompatActivity {
    static int j = 0;
    static int IntentEntraButton = 0;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter; // Adaptador de seccions
    private ViewPager mViewPager; // Objecte que identifica un ViewPager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inici);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); //La toolbar
        //      setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager()); //enllaç a l'adaptador

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container); //establim objecte Viewpager del contenidor/layout
        mViewPager.setAdapter(mSectionsPagerAdapter); // enllaç al ViewPager

        Button btn_inicia = (Button) findViewById(R.id.button_inicia); //Establim objecte button nombrat btn_incia a un botó
        btn_inicia.setOnClickListener(new View.OnClickListener() { //Quan el botó es clica entra un mètode o procediment
            @Override // identifica un nou procediment
            public void onClick(View v) { //nom i tipus del mètode dinàmic
                Intent NovaEntrada = new Intent(getApplicationContext(),NavigationDrawer.class); //es crea un intent, una intenció anomenada NovaEntrada
                startActivity(NovaEntrada);
            }
        });

    }
/*
    @Override // menú amb toolbar que realment no necessitem, però ho deixem en comentari per si fos un cas. Aquestes línies no les llegeix el dispositiu.
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inici, menu);
        return true;

    }

    @Override //opcions del menú de la toolbar
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
*/
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class Fragment1 extends Fragment { //Fragment, adaptador que recull el Viewpager. És el fragment número1, el del principi
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public Fragment1() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static Fragment1 newInstance(int sectionNumber) { //Funció que crea instància del fragment
            Fragment1 fragment = new Fragment1(); // nombrem un objecte Fragment 1 com fragment i diem que és un nou objecte de classe Fragment1
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_inici, container, false); // Única vista on carga el fragment. El rootview ens serveix per poder accedir al fragment de deconstruir-lo.
            IntentEntraButton = 1;
            return rootView;
        }
    }

    public static class fragment_inici_2 extends Fragment { //Fragment, adaptador que recull el Viewpager
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public fragment_inici_2() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static fragment_inici_2 newInstance(int sectionNumber) { //Funció que crea instància del fragment
            fragment_inici_2 Fragment = new fragment_inici_2();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            Fragment.setArguments(args);
            return Fragment;
        }

        @Override   // Que layout cargar en l'XML
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_inici_2, container, false); // Única vista on carga el fragment.
            IntentEntraButton = 2;
            return rootView;
        }
    }

    public static class fragment_inici_3 extends Fragment { //Fragment, adaptador que recull el Viewpager
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public fragment_inici_3() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static fragment_inici_3 newInstance(int sectionNumber) { //Funció que crea instància del fragment
            fragment_inici_3 Fragment = new fragment_inici_3();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            Fragment.setArguments(args);
            return Fragment;
        }

        @Override   // Que layout cargar en l'XML
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_inici_3, container, false); // Única vista on carga el fragment.
            Button btn_informacio = (Button) rootView.findViewById(R.id.buttoninformacio); //Aquest objecte, encara que estigui en un fragment el podem utilitzar els mètodes que volguem sempre que fiquem rootView.
            IntentEntraButton = 3;
            btn_informacio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent InformacioIntent = new Intent(rootView.getContext(),Portal.class);
                    startActivity(InformacioIntent);
                }
            });
            return rootView;
        }
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter { //adaptador del viewpager de la línea 31. És una classe que s'extén pel fragmentAdapter

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        } // constructor

        @Override
        public Fragment getItem(int position) { //getItem és com una instància del fragment de la pantalla
            switch (position) { //depenent de la posició del PagerView tindrem un fragment o un altre
                case 0:
                    return Fragment1.newInstance(position + 1);
                case 1:
                    return fragment_inici_2.newInstance(position + 1);
                case 2:
                    return fragment_inici_3.newInstance(position +1);
            }

            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return null;
        }



        @Override // funció que retornarà el número total de pàgines
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override // funcio de titol de cada pàgina, ho utilitzarem per les un ítem d' activity_inici.xml
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "CREA";
                case 1:
                    return "DESCOBREIX";
                case 2:
                    return "ACTUALITZACIONS";
            }
            return null;
        }
    }
}
