package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retirada de dinero.
 * 
 * @author rodri
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta bancaria */
    private String cuenta;
    
    /** Saldo disponible en la cuenta */
    private double saldo;
    
    /** Tipo de interés asociado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros que inicializa la cuenta con los valores proporcionados.
     * 
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de cuenta bancaria.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo; // Se añade la inicialización del tipo de interés
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     * 
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     * 
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

