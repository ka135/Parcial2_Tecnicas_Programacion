import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();


        System.out.print("Ingrese el numero de pasaporte: ");
        String numpasaporte = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        String edad = scanner.nextLine();

        System.out.print("Ingrese la preferencia alimenticia: ");
        String alimentos = scanner.nextLine();

        Vuelo bibliotecaKonradLorenz = new Vuelo();
        /**
         * Se crean cinco objetos de la clase 'Libro' con diferentes títulos, autores y número de páginas
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        Vuelo vuelo1 = new Vuelo(78,"Bogota","Medellin","12/09/2023", 5.30, 45);
        Vuelo vuelo2 = new Vuelo(13,"Cali","Cartagena","23/01/2023", 2.00, 100);
        Vuelo vuelo3 = new Vuelo(56,"Cartagena","Bucaramanga","6/05/2023", 7.40, 60);
        Vuelo vuelo4 = new Vuelo(29,"Santa Marta","Barranquilla","22/10/2023", 13.30, 30);
        Vuelo vuelo5 = new Vuelo(83,"Bucaramanga","Medellin","10/12/2023", 10.30, 56);
        Vuelo vuelo6 = new Vuelo(40,"Barranquilla","Santa Marta","20/02/2023", 21.30, 46);
    }
}