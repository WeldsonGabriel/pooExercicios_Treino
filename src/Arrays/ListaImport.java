package Arrays;

public class ListaImport {
    // criar varios arrays de tipos diferentes e eu listas para treinar importação
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] letras = {"A", "B", "C", "D", "E"};
        String[] paises = {"Brasil", "Argentina", "Chile", "Peru", "Colombia"};

        System.out.println("Números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Letras:");
        for (String letra : letras) {
            System.out.println(letra);
        }

        System.out.println("Países:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
