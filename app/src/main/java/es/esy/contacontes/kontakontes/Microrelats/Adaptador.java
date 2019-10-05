package es.esy.contacontes.kontakontes.Microrelats;

import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import es.esy.contacontes.kontakontes.R;

/**
 * Created by Oriol.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.MrViewHolder> {

    List<MrConte> ListMrConte;

    public Adaptador(List<MrConte> listMrConte) {
        ListMrConte = listMrConte; //Constructor de la llista
    }

    @Override
    public MrViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        MrViewHolder holder = new MrViewHolder(v); //Creació d'un holder per agafar el layout row_item
        return holder;
    }

    @Override
    public void onBindViewHolder(MrViewHolder holder, int position) { //establir mètodes per poder ficar img i txt
        holder.imgMr.setImageResource(ListMrConte.get(position).getFoto());
        holder.txtMr.setText(ListMrConte.get(position).getTxt());
        holder.mc.setText(ListMrConte.get(position).getMc());
    }

    @Override
    public int getItemCount() { //Mirar quina mesurar té la Llista
        return ListMrConte.size();
    }

    public static class MrViewHolder extends RecyclerView.ViewHolder {
        //Creació dels objectes

        ImageView imgMr;
        TextView txtMr;
        TextView mc;

        public MrViewHolder (final View itemView){
            super(itemView);
            imgMr = (ImageView) itemView.findViewById(R.id.imgConte);
            txtMr = (TextView) itemView.findViewById(R.id.txtConte);
            mc = (TextView) itemView.findViewById(R.id.txtMc);
        }

    }

}
