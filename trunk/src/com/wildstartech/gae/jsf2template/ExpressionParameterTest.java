package com.wildstartech.gae.jsf2template;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="ExpressionParameterTest")
@RequestScoped
public class ExpressionParameterTest {
	public String echo(String echoValue) {
		return "You said: "+echoValue;
	}
}
