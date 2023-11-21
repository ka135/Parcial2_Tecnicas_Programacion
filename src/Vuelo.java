import java.util.LinkedList;
public class Vuelo {
    private int numerodevuelo;
    private String origen;
    private String destino;
    private String fecha;
    private double hora;
    private int mapasajeros;

    public Vuelo(int numerodevuelo, String origen, String destino, String fecha, double hora, int mapasajeros) {
        this.numerodevuelo = numerodevuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.mapasajeros = mapasajeros;
    }

    public int getNumerodevuelo() {
        return numerodevuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return (int) hora;
    }

    public int getMapasajeros() {
        return mapasajeros;
    }

    public void setNumerodevuelo(int numerodevuelo) {
        this.numerodevuelo = numerodevuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMapasajeros(int mapasajeros) {
        this.mapasajeros = mapasajeros;
    }

    public LinkedList vuelos = new LinkedList();

    public void registrarvuelo(Vuelo Vuelo) {
        vuelos.add(Vuelo);
    }

    public Vuelo buscarLibro(String numerodevuelo) {
        for (int i = 0; i < vuelos.size(); i = i + 1) {
            Vuelo vuelo1 = vuelos.get(i);
            if (numerodevuelo.equals(vuelo1.getNumerodevuelo())) {
                return vuelo1;
            }
        }
        return null;
    }

    /**
     * Método para obtener la lista de libros disponibles en la biblioteca
     * Complejidad temporal: O(1) Operacion de Tiempo Constante
     */
    public LinkedList getVuelos() {
        return vuelos;
    }
}