public class Velero extends Embarcacion implements Validacion {
    private int numeroMastiles;

    public Velero(int valorBase, int anioDeFabricacion, int numeroMastiles, Capitan capitan ) {
        super(valorBase, anioDeFabricacion,capitan);
        this.numeroMastiles = numeroMastiles;
    }


    @Override
    public boolean validar() {
        return numeroMastiles > 4;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
}
