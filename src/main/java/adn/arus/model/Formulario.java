package adn.arus.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Formulario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String tipoDocumento;
	private String numeroDocumento;
	private String administradoraSalud;
	private String administradoraPension;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private Date fechaAfiliacionSalud;
	private Date fechaAfiliacionPension;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getAdministradoraSalud() {
		return administradoraSalud;
	}
	public void setAdministradoraSalud(String administradoraSalud) {
		this.administradoraSalud = administradoraSalud;
	}
	public String getAdministradoraPension() {
		return administradoraPension;
	}
	public void setAdministradoraPension(String administradoraPension) {
		this.administradoraPension = administradoraPension;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public Date getFechaAfiliacionSalud() {
		return fechaAfiliacionSalud;
	}
	public void setFechaAfiliacionSalud(Date fechaAfiliacionSalud) {
		this.fechaAfiliacionSalud = fechaAfiliacionSalud;
	}
	public Date getFechaAfiliacionPension() {
		return fechaAfiliacionPension;
	}
	public void setFechaAfiliacionPension(Date fechaAfiliacionPension) {
		this.fechaAfiliacionPension = fechaAfiliacionPension;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
