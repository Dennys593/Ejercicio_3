import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== TALLER DE TRAJES =====");
        System.out.print("Modelo del traje: ");
        String modelo = sc.nextLine();
        System.out.print("Energia inicial (0 a 100): ");
        int energia = sc.nextInt();
        Traje original = new Traje(modelo, energia);

        // Solo copia la referencia: ambas variables apuntan al MISMO objeto
        Traje alias = original;

        // Constructor de copia: crea un objeto NUEVO e independiente
        Traje copia = new Traje(original);
        System.out.print("Energia a descargar del alias: ");
        int c1 = sc.nextInt();
        System.out.print("Energia a descargar de la copia: ");
        int c2 = sc.nextInt();
        alias.descargar(c1);
        copia.descargar(c2);
        System.out.print("original: ");
        original.mostrar();
        System.out.print("alias:    ");
        alias.mostrar();
        System.out.print("copia:    ");
        copia.mostrar();
        System.out.println("original == alias? " + (original == alias));
        System.out.println("original == copia? " + (original == copia));
        sc.close();
    }
}