package com.ndr.free.jsf20.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="sampleBean2")
@RequestScoped
public class SampleBean2 implements Serializable{

	private String strProperty1;
	private String strProperty2;
	
	public SampleBean2() {
		
	}

	public String getStrProperty1() {
		return strProperty1;
	}

	public void setStrProperty1(String strProperty1) {
		this.strProperty1 = strProperty1;
	}
	
	public void performAction(){
		strProperty2 = strProperty1;
	}

	public String getStrProperty2() {
		return strProperty2;
	}


		
}
