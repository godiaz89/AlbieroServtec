package net.albiero.albierost;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
