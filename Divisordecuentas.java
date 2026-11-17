import java.util.Scanner;

public class Divisordecuentas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Porcentaje de los impuestos de compra y servicio*/
        final double IVA = 0.13;
        final double SERVICIO = 0.10;

        System.out.println("Bienvenido al Divisor de cuentas.\n");
        System.out.println("Si no sabes cuánto tienes que pagarle al restaurante,\nestás en el lugar correcto\n");

        /*Instrucciones y recolección de cantidades*/
        
        System.out.println("Ingrese la cantidad de personas que pagan: ");
        int personas = input.nextInt();

        while(personas <= 0){//Verifica que el valor de personas sea mayor a 0
            System.out.println("Cantidad de personas no puede ser 0 o menor.");
            System.out.println("Vuelve a intentarlo: ");
            personas = input.nextInt();
        }

        System.out.println("Ingrese la cantidad de comidas y/o refrescos que pidió: ");
        int cantidadAlimentos = input.nextInt();

        while(cantidadAlimentos <= 0){//Verifica que el valor de cantidadAlimentos sea mayor a 0
            System.out.println("Cantidad de alimentos no puede ser 0 o menos.");
            System.out.println("Vuelve a intentarlo: ");
            cantidadAlimentos = input.nextInt();
        }

        double subtotal = 0.0; //resultado del primer for loop (precio sin impuestos)
        
        for(int i = 1; i <= cantidadAlimentos; i++){
            double precio = 0.0;

            System.out.println("Precio del producto " + i + ": ");
            precio = input.nextDouble() + precio;

            while(precio < 0){//Verifica que el precio no sea negativo
                System.out.println("Precio no puede ser menos que 0.");
                System.out.println("Vuelve a intentarlo: ");
                precio = input.nextDouble();
            }

            subtotal += precio;
        }

        double total = impuestos(subtotal, IVA, SERVICIO);//Llamar al metodo impuestos

        double subtotalPorPersona = subtotal/personas;//Monto subtotal (sin impuestos) por persona
        double totalPorPersona = total/personas;//Monto total (con impuestos) por persona

        System.out.println("-----------------------------------------------");
        System.out.println("    Información de pago    ");
        System.out.println();
        System.out.printf("-Monto subtotal completo: CRC %.2f%n\n", subtotal);
        System.out.printf("-Monto total completo: CRC %.2f%n", total);
        System.out.println();
        System.out.printf("-Monto subtotal por persona CRC %.2f%n\n", subtotalPorPersona);
        System.out.printf("-Monto total por persona: CRC %.2f%n\n", totalPorPersona);
        System.out.println("-----------------------------------------------");

        input.close();

    }
    public static double impuestos(double subtotal, double IVA, double SERVICIO){
        double impuestos =  subtotal * (IVA + SERVICIO); //Multiplica IVA y Servicio al total
        double total = impuestos + subtotal;//Suma taxes a total para dar total con taxes

        return total;
    }

}
