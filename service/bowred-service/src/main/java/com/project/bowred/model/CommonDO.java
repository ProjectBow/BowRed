package com.project.bowred.model;

public class CommonDO {
	private String name;
	private Integer value;
	
	public CommonDO() {
		this.name = "test";
		this.value = new Integer(10);
	}
	
	public CommonDO(String _name, Integer _value) {
		this.name = _name;
		this.value = _value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
