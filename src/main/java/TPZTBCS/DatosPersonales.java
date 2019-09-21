package TPZTBCS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Datos_Personales")
public class DatosPersonales {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DATOS_PERSONALES_ID")
	int ID;
	
	
	@Column(name = "NOM_USUARIO")
	String nombre;
	@Column(name = "EDAD_USUARIO")
	int edad;
	@Column(name = "MAIL_USUARIO")
	String email;
	@Column(name = "FRIO_MAX")
	int FrioMaximo=15;//dejo 15 como default == si hace menos de 15 grados se abriga con algunas prendas
	@Column(name = "FRIO_MIN")
	int FrioMinimo=0; // si hace menos de 0 grados se abriga con todo lo que pueda
	@Column(name = "FRIO_MANOS")
	int FrioManos=15;
	@Column(name = "FRIO_CUELLO")
	int FrioCuello=15;
	@Column(name = "FRIO_CABEZA")
	int FrioCabeza=15;

	public DatosPersonales() {}

	public void setNombre(String name) {
		this.nombre = name;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setEmail(String EmailNueva) {
		this.email=EmailNueva;
	}
	public void setFrioMaximo(int FrioMaximoNuevo) {
		this.FrioMaximo=FrioMaximoNuevo;
	}
	public void setFrioMinimo(int FrioMinimoNueva) {
		this.FrioMinimo=FrioMinimoNueva;
	}
	public void setFrioManos(int FrioManosNuevo) {
		this.FrioManos=FrioManosNuevo;
	}
	public void setFrioCuello(int FrioCuelloNueva) {
		this.FrioCuello=FrioCuelloNueva;
	}
	public void setFrioCabeza(int FrioCabezaNueva) {
		this.FrioCabeza=FrioCabezaNueva;
	}
	
	public int getId() {
        return ID;
    }
	public String getNombre () {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getEmail() {
		return this.email;
	}
	public int getFrioMaximo() {
		return this.FrioMaximo;
	}
	public int getFrioMinimo() {
		return this.FrioMinimo;
	}
	public int getFrioManos() {
		return this.FrioManos;
	}
	public int getFrioCuello() {
		return this.FrioCuello;
	}
	public int getFrioCabeza() {
		return this.FrioCabeza;
	}
	
}
