public abstract class Vehiculo {

    protected String marca;
    protected int velmax;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int velmax) {
        this.marca = marca;
        this.velmax = velmax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velmax=" + velmax +
                '}';
    }
    public abstract void moverse();
    public void mostrarinf(){
        System.out.println("MARCA DEL AUTOMOVIL : " +marca);
        System.out.println("SU VELOCIDAD MAXIMA ES DE : " +velmax);

    }

}
