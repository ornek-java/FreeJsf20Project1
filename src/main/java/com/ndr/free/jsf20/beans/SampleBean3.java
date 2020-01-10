package com.ndr.free.jsf20.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="sampleBean3")
@RequestScoped
public class SampleBean3 implements Serializable{

	private String strProperty1;
	private String strProperty2;
	
	public SampleBean3() {
		
	}

	public String getStrProperty1() {
		return strProperty1;
	}

	public void setStrProperty1(String strProperty1) {
		this.strProperty1 = strProperty1;
	}
		
	public String getStrProperty2() {
		return strProperty2;
	}
	
	public void performAction(){
		strProperty2 = strProperty1;
	}
	

	public void onApplyRequestValues(){
		System.out.println("APPLY_REQUEST_VALUES");
	}
	
	public void onProcessValidations(){
		System.out.println("PROCESS_VALIDATIONS");
	}
	
	public void onUpdateModelValues(){
		System.out.println("UPDATE_MODEL_VALUES");
	}
	
	public void onInvokeApplication(){
		System.out.println("INVOKE_APPLICATION");
	}
	
		
}
