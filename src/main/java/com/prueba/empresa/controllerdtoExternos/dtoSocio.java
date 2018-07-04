package com.prueba.empresa.controllerdtoExternos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "socio")
@XmlAccessorType(XmlAccessType.NONE)

public class dtoSocio implements Serializable{
	
	private static final long serialVersionUID = 01L;
	@XmlAttribute
	private Long id;
	@XmlAttribute
	private String nombre;
	@XmlAttribute
	private float tasaInteres;
	@XmlAttribute
	private float montoMaximo;
	
	public dtoSocio() {}
	
	public dtoSocio(String nombre, float tasaInteres, float montoMaximo) {
		super();
		this.nombre = nombre;
		this.tasaInteres = tasaInteres;
		this.montoMaximo = montoMaximo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public float getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(float montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	
}
