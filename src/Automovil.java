public class Automovil extends Vehiculo implements Motor {

    private double combustible;

    public Automovil(String marca, int velmax, double combustible) {
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
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", velmax=" + velmax +
                '}';
    }

    @Override
    public void moverse() {
        System.out.println("EL AUTOMOVIL ESTA MOVIENDOSE");
    }

    @Override
    public void consumocombustible(double litros) {
        if (combustible >= litros) {
            combustible -= litros;
            System.out.println("EL AUTOMOVIL CONSUMIO  " + litros + " LTS DE COMBUSTIBLE Y SU COMBUSTIBLE RESTANTE ES DE : " + combustible);
        } else {
            System.out.println("NO HAY COMBUSTIBLE SUFICUENTE PARA ANDAR");
        }
    }

    @Override
    public double getCombustible() {
        return combustible;
    }


}
