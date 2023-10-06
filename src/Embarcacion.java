public class Embarcacion {
    private int valorBase;
    private int anioDeFabricacion;
    private Capitan capitan;


    public Embarcacion(int valorBase, int anioDeFabricacion, Capitan capitan) {
        this.valorBase = valorBase;
        this.anioDeFabricacion = anioDeFabricacion;
        this.capitan = capitan;
    }

    public int calcularMontoAlquiler() {
        int montoAlquiler = valorBase;
        if (anioDeFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }



    public Capitan getCapitan() {
        return capitan;
    }


}





