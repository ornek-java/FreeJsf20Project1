package com.ndr.free.jsf20.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="sampleBean")
@RequestScoped
public class SampleBean implements Serializable{

	private String strProperty1;
	
	public SampleBean() {
		strProperty1 = "Hello JSF2.0";
	}

	public String getStrProperty1() {
		return strProperty1;
	}


	public void setStrProperty1(String strProperty1) {
		this.strProperty1 = strProperty1;
	}
		
}
