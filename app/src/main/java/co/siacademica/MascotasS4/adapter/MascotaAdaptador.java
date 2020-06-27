package co.siacademica.MascotasS4.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.siacademica.MascotasS4.R;
import co.siacademica.MascotasS4.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>  {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolderholder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewHolderholder.imgFotoCV.setImageResource(mascota.getFoto());
        mascotaViewHolderholder.nombreCV.setText(mascota.getNombre());
        mascotaViewHolderholder.numRaitingPet.setText(toString().valueOf(mascota.getRaiting()));

        mascotaViewHolderholder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Te encanta " + mascota.getNombre(), Toast.LENGTH_SHORT ).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFotoCV;
        private TextView nombreCV, numRaitingPet;
        private ImageButton imageButton;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFotoCV = (ImageView) itemView.findViewById(R.id.imgCVMascota);
            nombreCV = (TextView) itemView.findViewById(R.id.textViewCVNombre);
            imageButton = (ImageButton) itemView.findViewById(R.id.imgBtnCVLike);
            numRaitingPet = (TextView) itemView.findViewById(R.id.textViewCVContador);
        }
    }

}