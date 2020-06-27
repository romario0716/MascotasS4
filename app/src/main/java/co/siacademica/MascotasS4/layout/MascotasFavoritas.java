package co.siacademica.MascotasS4.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.siacademica.MascotasS4.R;
import co.siacademica.MascotasS4.adapter.MascotaAdaptador;
import co.siacademica.MascotasS4.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotasFAV;
    private RecyclerView listaMascotasFAV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar actionBar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(actionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotasFAV = (RecyclerView) findViewById(R.id.recyclerListaMascotasFAV);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFAV.setLayoutManager(linearLayoutManager);
        inicializarListaMascotas();
        inicializarAdaptador();


    }

    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotasFAV, this);
        listaMascotasFAV.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){

        mascotasFAV = new ArrayList<Mascota>();

        mascotasFAV.add(new Mascota(R.drawable.firulay, getResources().getString(R.string.nickname_pet4), 5));
        mascotasFAV.add(new Mascota(R.drawable.luna, getResources().getString(R.string.nickname_pet3), 8));
        mascotasFAV.add(new Mascota(R.drawable.manchas, getResources().getString(R.string.nickname_pet2), 4));
        mascotasFAV.add(new Mascota(R.drawable.bambie, getResources().getString(R.string.nickname_pet5), 2));
        mascotasFAV.add(new Mascota(R.drawable.teo, getResources().getString(R.string.nickname_pet6), 3));


    }


}