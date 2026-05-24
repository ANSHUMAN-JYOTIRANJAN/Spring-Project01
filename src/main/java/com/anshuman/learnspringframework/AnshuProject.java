package com.anshuman.learnspringframework;

import java.io.Serializable;

class pojo{
	private String text;
	
	private int number;
	
	public String toString() {
		return text + ":"+ number;
	}
	
}
class JavaBean implements Serializable{
	
	public JavaBean() {
		
	}
	private String text;
	private int number;
	
}
public class AnshuProject {
	
}
