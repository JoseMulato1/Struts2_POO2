package com.sv.udb.vista;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.sv.udb.modelo.*;
import com.sv.udb.controlador.*;

public class UsuariosVista extends  ActionSupport{
	private static final long serialVersionUID = 9149826260758390091L;
	private Usuarios objeUsua;
	private List<Usuarios> listAlum;
	private List<Usuarios> listUsua;
	private Long id;
	
	private UsuariosBean usuariosManager;

	public UsuariosVista() {
		usuariosManager = new UsuariosBean();
	}

	public String execute() {
		this.listAlum = usuariosManager.findAll();
		System.out.println("execute called");
		return SUCCESS;
	}

	public Usuarios getObjeUsua() {
		return objeUsua;
	}
	public void setObjeUsua(Usuarios objeUsua) {
		this.objeUsua = objeUsua;
	}
	public List<Usuarios> getListUsua() {
		return listUsua;
	}
	public void setListUsua(List<Usuarios> listUsua) {
		this.listUsua = listUsua;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String guar(){
		this.getObjeUsua().setEstaUsua(0);
		System.out.println(this.getObjeUsua());
		try {
			usuariosManager.persist(this.getObjeUsua());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.listUsua = usuariosManager.findAll();
		return SUCCESS;
	}

	public String delete() {
		try {
			usuariosManager.remove(this.getObjeUsua());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.listUsua = usuariosManager.findAll();
		return SUCCESS;
	}
}