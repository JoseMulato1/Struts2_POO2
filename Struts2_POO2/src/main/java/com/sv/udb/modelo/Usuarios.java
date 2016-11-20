// default package
// Generated 11-18-2016 03:21:02 PM by Hibernate Tools 5.2.0.Beta1
package com.sv.udb.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios", catalog = "struts")
public class Usuarios implements java.io.Serializable {

	private static final long serialVersionUID = -8767337896773261247L;
	private Integer codiUsua;
	private Alumnos alumnos;
	private String acceUsua;
	private String contUsua;
	private int estaUsua;

	public Usuarios() {
	}

	public Usuarios(Alumnos alumnos, String acceUsua, String contUsua, int estaUsua) {
		this.alumnos = alumnos;
		this.acceUsua = acceUsua;
		this.contUsua = contUsua;
		this.estaUsua = estaUsua;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "codi_usua", unique = true, nullable = false)
	public Integer getCodiUsua() {
		return this.codiUsua;
	}

	public void setCodiUsua(Integer codiUsua) {
		this.codiUsua = codiUsua;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codi_alum", nullable = false)
	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	@Column(name = "acce_usua", nullable = false, length = 100)
	public String getAcceUsua() {
		return this.acceUsua;
	}

	public void setAcceUsua(String acceUsua) {
		this.acceUsua = acceUsua;
	}

	@Column(name = "cont_usua", nullable = false, length = 100)
	public String getContUsua() {
		return this.contUsua;
	}

	public void setContUsua(String contUsua) {
		this.contUsua = contUsua;
	}

	@Column(name = "esta_usua", nullable = false)
	public int getEstaUsua() {
		return this.estaUsua;
	}

	public void setEstaUsua(int estaUsua) {
		this.estaUsua = estaUsua;
	}

}