package com.myspace.p1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class pl implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public java.util.HashMap<String, Object> m;

	@org.kie.api.definition.type.Label(value = "a1")
	private java.lang.Byte a1;

	public pl() {
	}

	public pl(java.util.HashMap<String, Object> m) {
		this.m = m;
	}

	public void setM(java.util.HashMap<String, Object> m) {
		this.m = m;
	}

	public java.util.HashMap<String, Object> getM() {
		return this.m;
	}

	@Override
	public String toString() {
		return " [ m = " + m + " ] ";
	}

	public java.lang.Byte getA1() {
		return this.a1;
	}

	public void setA1(java.lang.Byte a1) {
		this.a1 = a1;
	}

	public pl(java.lang.Byte a1) {
		this.a1 = a1;
	}

}