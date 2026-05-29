package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "tbl_actividad")
public class Actividad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad")
	private int idActividad;
	
	
	@Column(name = "descripcion")
	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	
	@Column(name = "nro_vacantes")
	private int nroVacantes;
	
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private categoria categoria;
	
	
	public String toString(){
		return descripcion;
	}
}
