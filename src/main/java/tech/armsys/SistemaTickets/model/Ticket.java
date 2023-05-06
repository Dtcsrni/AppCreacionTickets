package tech.armsys.SistemaTickets.model;

import java.util.Date;

public class Ticket {

	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private Long idCreador;
	private Long idEquipoResponsable;
	private int tipoIncidencia;
	private int gravedadIncidencia;
	private float versionSoftwareIncidencia;
	private String descripcionProblema;
	private int estatus;
	private Boolean archivado;
	
	
	
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}





	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}





	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}





	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}





	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}





	/**
	 * @return the idCreador
	 */
	public Long getIdCreador() {
		return idCreador;
	}





	/**
	 * @param idCreador the idCreador to set
	 */
	public void setIdCreador(Long idCreador) {
		this.idCreador = idCreador;
	}





	/**
	 * @return the idEquipoResponsable
	 */
	public Long getIdEquipoResponsable() {
		return idEquipoResponsable;
	}





	/**
	 * @param idEquipoResponsable the idEquipoResponsable to set
	 */
	public void setIdEquipoResponsable(Long idEquipoResponsable) {
		this.idEquipoResponsable = idEquipoResponsable;
	}





	/**
	 * @return the tipoIncidencia
	 */
	public int getTipoIncidencia() {
		return tipoIncidencia;
	}





	/**
	 * @param tipoIncidencia the tipoIncidencia to set
	 */
	public void setTipoIncidencia(int tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}





	/**
	 * @return the gravedadIncidencia
	 */
	public int getGravedadIncidencia() {
		return gravedadIncidencia;
	}





	/**
	 * @param gravedadIncidencia the gravedadIncidencia to set
	 */
	public void setGravedadIncidencia(int gravedadIncidencia) {
		this.gravedadIncidencia = gravedadIncidencia;
	}





	/**
	 * @return the versionSoftwareIncidencia
	 */
	public float getVersionSoftwareIncidencia() {
		return versionSoftwareIncidencia;
	}





	/**
	 * @param versionSoftwareIncidencia the versionSoftwareIncidencia to set
	 */
	public void setVersionSoftwareIncidencia(float versionSoftwareIncidencia) {
		this.versionSoftwareIncidencia = versionSoftwareIncidencia;
	}





	/**
	 * @return the descripcionProblema
	 */
	public String getDescripcionProblema() {
		return descripcionProblema;
	}





	/**
	 * @param descripcionProblema the descripcionProblema to set
	 */
	public void setDescripcionProblema(String descripcionProblema) {
		this.descripcionProblema = descripcionProblema;
	}





	/**
	 * @return the estatus
	 */
	public int getEstatus() {
		return estatus;
	}





	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}





	/**
	 * @return the archivado
	 */
	public Boolean getArchivado() {
		return archivado;
	}





	/**
	 * @param archivado the archivado to set
	 */
	public void setArchivado(Boolean archivado) {
		this.archivado = archivado;
	}





	public Ticket() {
		// TODO Auto-generated constructor stub
	}

}
