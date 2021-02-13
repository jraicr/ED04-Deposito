package cuentas;

/**
 * Esta clase se encarga de la gestión de una cuenta corrienta.
 * @author jraic
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor 
     * @param nom El nombre de la cuenta.
     * @param cue El código IBAN de la cuenta.
     * @param sal El saldo de la cuenta.
     * @param tipo El tipo de interés que tiene la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Comprueba el saldo de la cuenta.
     * @return el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Adiciona saldo a la cuenta.
     * @param cantidad La cantidad a adicionar al saldo de la cuenta.
     * @throws Exception En caso de que la cantidad indicada sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Resta saldo de la cuenta.
     * @param cantidad La cantidad a restar del saldo de la cuenta.
     * @throws Exception En caso de que la cantidad indicada sea negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** Obtiene el nombre de la cuenta.
     * 
     * @return El nombre de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la cuenta.
     * @param nombre El nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Obtiene el código IBAN de la cuenta.
     * @return la cuenta o el código IBAN de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Cambia el código IBAN de la cuenta.
     * @param cuenta El nuevo código.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Obtiene el saldo de la cuenta.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /** Cambia el saldo de la cuenta.
     * @param saldo El nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Cambia el tipo de interés de la cuenta.
     * @param tipoInterés el nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
