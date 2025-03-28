public class Barco extends Vehiculo implements Motor {

    private double combustible;

    public Barco(String marca, int velmax, double combustible) {
        super(marca, velmax);
        this.combustible = combustible;
    }

    public double getcombustible() {
        return combustible;
    }

    public void setcombustible(double combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "combustible=" + combustible +
                ", marca='" + marca + '\'' +
                ", velmax=" + velmax +
                '}';
    }

    @Override
    public void moverse() {
        System.out.println("EL BARCO ESTA NAVEGANDO");
    }

    @Override
    public void consumocombustible(double litros) {
        if (combustible >= litros) {
            combustible -= litros;
            System.out.println("EL BARCO CONSUMIO " + litros + " LTS DE COMBUSTIBLE Y EL COMBUSTIBLE RESTANTE ES DE:  " + combustible);
        } else {
            System.out.println("NO HAY SUFIENTE COMBUSTIBLE PARA NAVEGAR");
        }
    }

    @Override
    public double getCombustible() {
        return combustible;
    }
}
