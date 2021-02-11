package cuentas;
/**
 * 
 * @author Antonio
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;
/**
 * 
 */
	public CCuenta() {
	}
/**
 * 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}
/**
 * 
 * @return
 */
	public double estado() {
		return getSaldo();
	}
/**
 * 
 * @param cantidad
 * @throws Exception
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
/**
 * 
 * @param cantidad
 * @throws Exception que controla que la cantidad no sea mayor que el saldo y la cantidad no sea negativa
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}
/**
 * 
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * 
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * 
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return tipoInteres
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * 
 * @param tipoInterés
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
