package net.albiero.albierost;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import testClasses.Ots;

public class RecyclerIndexAdapter extends RecyclerView.Adapter<RecyclerIndexAdapter.ViewHolder> {
    List<Ots> ots;

    public RecyclerIndexAdapter(List<Ots> ots) {
        this.ots = ots;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_index, parent,false);
        //set onclicklistener
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.repCom.setText(ots.get(position).getreCom());
        holder.nombre.setText(ots.get(position).getnombre());
        holder.motivo.setText(ots.get(position).getMotivo());
        holder.desc.setText(ots.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return ots.size();
    }

    @Override
    public void onAttachedToRecyclerView (RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }




    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView repCom;
        public TextView nombre;
        public TextView motivo;
        public TextView desc;




        public ViewHolder(View itemView) {

            super(itemView);
            this.nombre=(TextView)itemView.findViewById(R.id.textNombre);
            this.repCom=(TextView)itemView.findViewById(R.id.textALCard);
            this.motivo=(TextView)itemView.findViewById(R.id.textMotivo);
            this.desc=(TextView)itemView.findViewById(R.id.textDesc);

        }
    }
}

