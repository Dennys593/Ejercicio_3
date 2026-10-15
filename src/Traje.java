public class Traje {
    private String modelo;
    private int energia;

    public Traje(String modelo, int energia) {
        this.modelo = modelo;
        this.energia = energia;
    }

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
