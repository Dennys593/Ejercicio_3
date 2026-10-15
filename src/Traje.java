public class Traje {
    private String modelo;
    private int energia;

    // Constructor con parametros
    public Traje(String modelo, int energia) {
        this.modelo = modelo;
        this.energia = energia;
    }
    // Constructor de copia: recibe otro Traje y copia sus atributos
    public Traje(Traje otro) {
        this.modelo = otro.modelo;
        this.energia = otro.energia;
    }
    public void descargar(int cantidad) {
        energia = Math.max(0, energia - cantidad);
    }
    public void mostrar() {
        System.out.println(modelo + " con " + energia + "% de energia");
    }
}
