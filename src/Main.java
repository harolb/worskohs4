import java.util.Scanner;

public class Main {

    public static void ocsiones() {
        System.out.println("----MAKAIA----");
        System.out.println("- 1. Yates   -");
        System.out.println("- 2. velero  -");
        System.out.println("- 3. salir   -");
        System.out.println("______________");
    }


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int odcion = 0;
       do {
           ocsiones();
           System.out.println("ingrese la opcion");
           odcion= leer.nextInt();
           Capitan capitan = new Capitan("jhon","bermudez","B12M345");
           Embarcacion embarcacion =new Embarcacion(50000, 2022,capitan);

           //System.out.println("Monto del alquiler de la embarcaion: $" + embarcacion.calcularMontoAlquiler());



           switch (odcion){
               case 1:
                   System.out.println("Ingrese modelo");
                   int anioFabricacionY = leer.nextInt();
                   System.out.println("Ingrese cantidad camarotes");
                   int cantidadCamarotesY = leer.nextInt();
                   Yate yate1 = new Yate(5,anioFabricacionY,capitan,cantidadCamarotesY); // Un yate con 5 camarotes
                   Yate yate2 = new Yate(10,2022,capitan,7); // Un yate con 10 camarotes

                   if (yate1.validar()) {
                       System.out.println("El yate 1 es de lujo.");
                   } else {
                       System.out.println("El yate 1 no es de lujo.");
                   }
                   System.out.println("El valor de alquiler es de: " + yate1.calcularMontoAlquiler());
                   System.out.println("Cantidad camarotes " + yate1.getNumeroCamarotes());
                   System.out.println("El capítan del yate sera : "+ yate1.getCapitan().getNomdre()+" " +yate1.getCapitan().getApellido());
                   System.out.println("Con matricula " + yate1.getCapitan().getMatriclaDeNavegacion());

                   break;

               case 2:
                   System.out.println("Ingrese modelo");
                   int anioFabricacionV = leer.nextInt();
                   System.out.println("Ingrese cantidad mastiles");
                   int cantidadmastilesV = leer.nextInt();
                   Velero velero1 = new Velero(3,anioFabricacionV,cantidadmastilesV,capitan); // Un velero con 3 mástiles
                   Velero velero2 = new Velero(5,2022,7,capitan); // Un velero con 5 mástiles

                   if (velero1.validar()) {
                       System.out.println("El velero 1 es grande.");
                   } else {
                       System.out.println("El velero 1 no es grande.");
                   }

                   System.out.println("El valor de alquiler es de: " + velero1.calcularMontoAlquiler());
                   System.out.println("Cantidad mastiles " + velero1.getNumeroMastiles());
                   System.out.println("El capítan del velero sera : "+ velero1.getCapitan().getNomdre()+" " +velero1.getCapitan().getApellido());
                   System.out.println("Con matricula " + velero1.getCapitan().getMatriclaDeNavegacion());

                   break;
              }

       if (odcion == 3){
           System.out.println("Adios, que tenga un feliz dia!");
       }
    } while (odcion != 3);
    }
}













