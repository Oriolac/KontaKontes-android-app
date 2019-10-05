package es.esy.contacontes.kontakontes;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.esy.contacontes.kontakontes.Contes.DContes;
import es.esy.contacontes.kontakontes.Microrelats.Microrelats;


public class Descobreix extends Fragment {

    private OnFragmentInteractionListener mListener;

    public Descobreix() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_descobreix, container, false); //Construccció de la vista view per poder fer dinàmic el fragment
        Button btn_micro = (Button) view.findViewById(R.id.btn_micro);
        btn_micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMr = new Intent(view.getContext(),Microrelats.class); //Botó que va cap a l'activitat Microrelats
                startActivity(intentMr);
            }
        });

        Button btn_contes = (Button) view.findViewById(R.id.btn_contes);
        btn_contes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentC = new Intent (view.getContext(), DContes.class); //Botó que va cap a l'activitat Contes.
                startActivity(intentC);
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
