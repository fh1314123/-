package com.xdl.bean;

import java.io.Serializable;

public class XdlEtAdmin implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "XdlEtAdmin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	private  int  id;
    private  String name;
    private  String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public XdlEtAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public XdlEtAdmin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
    
}
