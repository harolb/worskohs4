public class Yate extends Embarcacion implements Validacion {

    private int numeroCamarotes;

    public Yate(int valorBase, int anioDeFabricacion, Capitan capitan, int numeroCamarotes ) {
        super( valorBase,  anioDeFabricacion, capitan);
        this.numeroCamarotes = numeroCamarotes;
    }

    public void comprar() {
        if (validar()) {
            System.out.println("Yate de lujo comprado. ¡Disfruta de tu nueva embarcación de lujo!");
        } else {
            System.out.println("Yate comprado. ¡Disfruta de tu nueva embarcación!");
        }
    }

    @Override
    public boolean validar() {
        return   numeroCamarotes > 7;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }



}



