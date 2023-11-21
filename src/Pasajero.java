public class Pasajero {
    private String nombre;
    private int numpasaporte;
    private int edad;
    private String alimentos;

    public Pasajero(String nombre, int numpasaporte, int edad, String alimentos) {
        this.nombre = nombre;
        this.numpasaporte = numpasaporte;
        this.edad = edad;
        this.alimentos = alimentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumpasaporte() {
        return numpasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumpasaporte(int numpasaporte) {
        this.numpasaporte = numpasaporte;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }
}
