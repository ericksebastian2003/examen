class Main {
    protected String nombre;
    protected String comida;

    public Main(String nombre, String comida) {
        this.nombre = nombre;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComida() {
        return comida;
    }
}

class Comida1 extends Main {
    protected String precioPlato;

    public Comida1(String nombre, String comida, String precioPlato) {
        super(nombre, comida);
        this.precioPlato = precioPlato;
    }

    public String getPrecioPlato() {
        return precioPlato;
    }
}

class Comida2 extends Main {
    protected int calificacionComida;

    public Comida2(String nombre, String comida, int calificacionComida) {
        super(nombre, comida);
        this.calificacionComida = calificacionComida;
    }

    public int getCalificacionComida() {
        return calificacionComida;
    }
}

public class Comidas {
    public static void main(String[] args) {
        Main ejemplo1 = new Main("Encebollado", "Si");
        Comida1 ejemplo2 = new Comida1("Yahuarlocro", "No", "Precio");
        Comida2 ejemplo3 = new Comida2("Mote", "Sí", 5);

        System.out.println(ejemplo1.getNombre() + " - " + ejemplo1.getComida());
        System.out.println(ejemplo2.getNombre() + " - " + ejemplo2.getComida() + " - " + ejemplo2.getPrecioPlato());
        System.out.println(ejemplo3.getNombre() + " - " + ejemplo3.getComida() + " - " + ejemplo3.getCalificacionComida());
    }
}
