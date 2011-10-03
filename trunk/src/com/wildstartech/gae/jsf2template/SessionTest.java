package com.wildstartech.gae.jsf2template;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="sessionTest")
@SessionScoped
public class SessionTest {
	private String value=null;
	private int counter=0;
	
	public SessionTest() {
		System.out.println("created");
	}
	public void setValue(String value) {
		if (this.value == null) {
			this.value="";
		} else  {
			this.value=value;
		}
	}
	public String getValue() {
		return this.value;
	}
	public int getCounter() {
		return this.counter++;
	}
}
