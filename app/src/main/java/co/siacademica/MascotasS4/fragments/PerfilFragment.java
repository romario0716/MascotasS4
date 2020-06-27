package co.siacademica.MascotasS4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siacademica.MascotasS4.R;
import co.siacademica.MascotasS4.adapter.MascotaAdaptador;
import co.siacademica.MascotasS4.pojo.Mascota;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView fotosMiMascota;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotosMiMascota = (RecyclerView) view.findViewById(R.id.recyclerFragmentMiMascota);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fotosMiMascota.setLayoutManager(gridLayoutManager);

        inicializarListaMiMascota();
        inicializarAdaptador();

        return view;
    }

    public void inicializarListaMiMascota(){

        miMascota = new ArrayList<Mascota>();

        miMascota.add(new Mascota(R.drawable.luna1, getResources().getString(R.string.nickname_pet1),3));
        miMascota.add(new Mascota(R.drawable.luna2, getResources().getString(R.string.nickname_pet1),5));
        miMascota.add(new Mascota(R.drawable.luna3, getResources().getString(R.string.nickname_pet1),8));
        miMascota.add(new Mascota(R.drawable.luna4, getResources().getString(R.string.nickname_pet1),2));
        miMascota.add(new Mascota(R.drawable.luna5, getResources().getString(R.string.nickname_pet1),5));
    }


    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(miMascota, getActivity());
        fotosMiMascota.setAdapter(adaptador);

    }

}
