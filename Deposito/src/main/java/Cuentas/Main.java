package Cuentas;

/**
 *
 * @author Nelson de Matos 
 */
public class Main {
    
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        float cantidad = 0;

        miCuenta = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        
        operativa_cueta(saldoActual, miCuenta, cantidad);
        
    }

    public static void operativa_cueta(double saldoActual, CCuenta miCuenta, float cantidad) {
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
