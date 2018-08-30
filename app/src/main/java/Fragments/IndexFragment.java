package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.albiero.albierost.R;
import net.albiero.albierost.RecyclerIndexAdapter;
import net.albiero.albierost.RecyclerOtAdapter;

import java.util.ArrayList;
import java.util.List;

import testClasses.Ots;


public class IndexFragment extends Fragment {
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lm;
    private static RecyclerView rv;
    private static List<Ots> ots = new ArrayList<Ots>();


    public IndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_index, container, false);
        rv=(RecyclerView)view.findViewById(R.id.indexRecycler);
        lm= new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);

        ots.add(new Ots("AL-5259/0","Gonzalo Diaz","Falla bateria", "Problema de bateria en abonado, el señor pindonga llamo quejandose" ));
        ots.add(new Ots("AL-10/0","AREVALO SRL","GPRS No Comunica", "Los pibes de arevalo estan calientes porque no van los tecnicos"));
        ots.add(new Ots("AL-9840/0","BOSCH TUCUMAN", "OTROS", "Rodolfo rompe el pingo quiere que veamos la bosch"));
        ots.add(new Ots("AL-5259/0","Gonzalo Diaz","Falla bateria", "Problema de bateria en abonado, el señor pindonga llamo quejandose" ));
        ots.add(new Ots("AL-10/0","AREVALO SRL","GPRS No Comunica", "Los pibes de arevalo estan calientes porque no van los tecnicos"));
        ots.add(new Ots("AL-9840/0","BOSCH TUCUMAN", "OTROS", "Rodolfo rompe el pingo quiere que veamos la bosch"));
        ots.add(new Ots("AL-5259/0","Gonzalo Diaz","Falla bateria", "Problema de bateria en abonado, el señor pindonga llamo quejandose" ));
        ots.add(new Ots("AL-10/0","AREVALO SRL","GPRS No Comunica", "Los pibes de arevalo estan calientes porque no van los tecnicos"));
        ots.add(new Ots("AL-9840/0","BOSCH TUCUMAN", "OTROS", "Rodolfo rompe el pingo quiere que veamos la bosch"));
        ots.add(new Ots("AL-5259/0","Gonzalo Diaz","Falla bateria", "Problema de bateria en abonado, el señor pindonga llamo quejandose" ));
        ots.add(new Ots("AL-10/0","AREVALO SRL","GPRS No Comunica", "Los pibes de arevalo estan calientes porque no van los tecnicos"));
        ots.add(new Ots("AL-9840/0","BOSCH TUCUMAN", "OTROS", "Rodolfo rompe el pingo quiere que veamos la bosch"));
        ots.add(new Ots("AL-5259/0","Gonzalo Diaz","Falla bateria", "Problema de bateria en abonado, el señor pindonga llamo quejandose" ));
        ots.add(new Ots("AL-10/0","AREVALO SRL","GPRS No Comunica", "Los pibes de arevalo estan calientes porque no van los tecnicos"));
        ots.add(new Ots("AL-9840/0","BOSCH TUCUMAN", "OTROS", "Rodolfo rompe el pingo quiere que veamos la bosch"));

        adapter = new RecyclerIndexAdapter(ots);
        rv.setAdapter(adapter);
        return view;
    }
}
