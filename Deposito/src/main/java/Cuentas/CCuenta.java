/**
 * Paquete cuentas donde se encuentran las clases CCuenta y la clase Main, la cual tiene dentro el método main.
 * La clase Cuentas tienes atributos privados para acceder a ellos se establecen metodos getter y setter
 */
package Cuentas;

/**
 * 
 * @author Nelson de Matos
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta1
     */
    public String getCuenta1() {
        return cuenta1;
    }

    /**
     * @param cuenta1 the cuenta1 to set
     */
    public void setCuenta1(String cuenta1) {
        this.cuenta1 = cuenta1;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteraccion
     */
    public double getTipoInteraccion() {
        return tipoInteraccion;
    }

    /**
     * @param tipoInteraccion the tipoInteraccion to set
     */
    public void setTipoInteraccion(double tipoInteraccion) {
        this.tipoInteraccion = tipoInteraccion;
    }

    /**
     * Atributos privados de la clase CCuenta
     * String nombre
     * String cuenta1
     * double saldo
     * double tipoInteraccion
     */
    private String nombre;
    private String cuenta1;
    private double saldo;
    private double tipoInteraccion;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta1=cue;
        saldo=sal;
    }

    /**
     * 
     * @return devuelve lo que devuelva el método getSaldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Con este método se ingresa una cantidad en la cuenta, se establece una excepción para controlar que la cantidad sea igual o mayor que cero
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Se retira una cantidad de la ceunta, se establece una excepción para controlar que la cantidad a retirar no sea negativa
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
}
