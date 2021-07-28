package br.com.samuel.cursomc.resources.handler;

import java.io.Serializable;
import java.time.LocalDate;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String mensage;
	private LocalDate time;
	
	public StandardError(Integer status, String mensage, LocalDate time) {
		this.status = status;
		this.mensage = mensage;
		this.time = time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}
	

	
	
}
