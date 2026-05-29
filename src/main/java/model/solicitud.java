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

@Setter
@Getter

@Entity
@Table(name = "tbl_solicitud")
public class solicitud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_solicitud")
	private int nroSolicitud;
	
	@Column(name = "estado")
	private String estado; 
	
	
	@Column(name = "archivo_adjunto")
	private String archivoAdjunto;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reg")
	private Date fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "id_actividad")
	private Actividad actividad;

}
