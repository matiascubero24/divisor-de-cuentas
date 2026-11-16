import java.util.Scanner;

public class Divisordecuentas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Porcentaje de los impuestos de compra y servicio*/
        final double IVA = 0.13;
        final double SERVICIO = 0.10;

        System.out.println("Bienvenido al Divisor de cuentas.");
        System.out.println("Si no sabes cuánto tienes que pagarle al restaurante,\nestás en el lugar correcto");

        /*Instrucciones y recolección de cantidades*/
        
        System.out.println("Ingrese la cantidad de personas que pagan: ");
        int personas = input.nextInt();

        while(personas <= 0){
            System.out.println("Cantidad de personas no puede ser 0. Alguien debe pagar.");
            System.out.println("Vuelve a intentarlo: ");
            personas = input.nextInt();
        }

        System.out.println("Ingrese la cantidad de comidas y/o refrescos que pidió: ");
        int cantidadAlimentos = input.nextInt();

        int producto = 1; //Usar en for loop

        double subtotal = 0.0; //resultado del primer for loop (precio sin impuestos)
        
        for(int i = 1; i <= cantidadAlimentos; i++){
            double precio = 0.0;

            System.out.println("Precio del producto " + producto + ": ");
            precio = input.nextDouble() + precio;
            subtotal += precio;

            producto++;
        }

        double total = impuestos(subtotal, IVA, SERVICIO);//Llamar al metodo impuestos

        double subtotalPorPersona = subtotal/personas;//Monto subtotal (sin impuestos) por persona
        double totalPorPersona = total/personas;//Monto total (con impuestos) por persona

        System.out.println("---------------------------");
        System.out.println("    Información de pago    ");
        System.out.println();
        System.out.println("-Monto subtotal completo: CRC" + subtotal);
        System.out.println("-Monto total completo: CRC" + total);
        System.out.println();
        System.out.println("-Monto subtotal por persona CRC" + subtotalPorPersona);
        System.out.println("-Monto total por persona: CRC" + totalPorPersona);

        input.close();

    }
    public static double impuestos(double subtotal, double IVA, double SERVICIO){
        double impuestos =  subtotal * (IVA + SERVICIO); //Multiplica IVA y Servicio al total
        double total = impuestos + subtotal;//Suma taxes a total para dar total con taxes

        return total;
    }

}
