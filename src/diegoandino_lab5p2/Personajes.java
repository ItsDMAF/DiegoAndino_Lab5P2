package diegoandino_lab5p2;

public class Personajes {

    static void add(Personajes personajes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nombre;
    private String poder;
    private String debilidad;
    private String universo;
    private int fuerza;
    private int agilidad;
    private int mental;
    private int hp;

    public Personajes(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidad, int mental, int hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.mental = mental;
        this.hp = hp;
    }

    public Personajes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nPoder: " + poder
                + "\nDebilidad: " + debilidad
                + "\nUniverso: " + universo
                + "\nFuerza:  " + fuerza
                + "\nAgilidad Fisica: " + agilidad
                + "\nAgilidad Mental: " + mental
                + "\nHP: " + hp;
    }

}
