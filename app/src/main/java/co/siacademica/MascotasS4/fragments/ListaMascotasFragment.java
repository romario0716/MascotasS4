package co.siacademica.MascotasS4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siacademica.MascotasS4.R;
import co.siacademica.MascotasS4.adapter.MascotaAdaptador;
import co.siacademica.MascotasS4.pojo.Mascota;

import java.util.ArrayList;

public class ListaMascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public ListaMascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);

        listaMascotas = (RecyclerView) view.findViewById(R.id.recyclerFragmentListaMascotas);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarListaMascotas();
        inicializarAdaptador();

        return view;
    }

    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.firulay, getResources().getString(R.string.nickname_pet4),5));
        mascotas.add(new Mascota(R.drawable.luna, getResources().getString(R.string.nickname_pet3),8));
        mascotas.add(new Mascota(R.drawable.manchas, getResources().getString(R.string.nickname_pet2),4));
        mascotas.add(new Mascota(R.drawable.bambie, getResources().getString(R.string.nickname_pet5),2));
        mascotas.add(new Mascota(R.drawable.teo, getResources().getString(R.string.nickname_pet6),3));
    }

}
