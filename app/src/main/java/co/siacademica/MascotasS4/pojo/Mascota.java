package co.siacademica.MascotasS4.pojo;

/**
 * Created by Miislyk on 24/07/2016.
 */
public class Mascota {

    private int foto;
    private String nombre;
    private int rate;
    private int raiting;

    public Mascota(int foto, String nombre, int raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}