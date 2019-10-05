package es.esy.contacontes.kontakontes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Crea.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Crea extends Fragment {

    private OnFragmentInteractionListener mListener;


    public Crea() { //Classe de l'activitat. Ha de estar buida perquè és estàtica.
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Creació de la Vista perquè aquest arxiu es pugui enllaçar a diferents layouts.
        final View view = inflater.inflate(R.layout.fragment_crea, container, false);
        Button btn_cordes = (Button)view.findViewById(R.id.btn_cordes); //Creació d'un objecte per poder crear una part dinàmica
        btn_cordes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCordes = new Intent(view.getContext(),CordesFormulari.class);
                startActivity(intentCordes);
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);

        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;

        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
