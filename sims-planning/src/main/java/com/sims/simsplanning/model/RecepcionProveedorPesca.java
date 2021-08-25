package com.sims.simsplanning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "recepcion_proveedor_pesca")
public class RecepcionProveedorPesca {
	
	
	private Integer idproveedor;

	private String bap;

	private String certificadoasc;

	private String codigoinp;

	private String codigosap;

	private String direccion;
	
	@Column(name="estado_proveedor")
	private Integer estadoProveedor;

	@Column(name="etiqueta_planta")
	private String etiquetaPlanta;

	private String nombre;

	private String ubicacion;

	@Column(name="idcomprador")
	private Integer comprador;

	

	private Integer idrecepcionproveedortipo;
	
	private Integer idsectorpesca;

	private Integer idtipoempresa;

	public RecepcionProveedorPesca() {
	}

	   public RecepcionProveedorPesca(String nombre, String codigosap, String direccion) {
	         this.nombre = nombre;
	         this.codigosap = codigosap;
	         this.direccion = direccion;
	    }
	   
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	        public Integer getIdproveedor() {
	        return idproveedor;
	    }
	    public void setIdproveedor(Integer idproveedor) {
	        this.idproveedor = idproveedor;
	    }
	    
	    public String getCodigosap() {
			return this.codigosap;
		}

		public void setCodigosap(String codigosap) {
			this.codigosap = codigosap;
		}
		
		public String getDireccion() {
			return this.direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public String getNombre() {
			return this.nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

}
