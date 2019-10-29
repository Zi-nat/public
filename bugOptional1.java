package javaSamples.bug_Optional;

import java.util.Optional;

public class bugOptional1 {
	
	private String a; 
	private Optional<bugOptional2> b; 
	
	public bugOptional1 (String a, Optional<bugOptional2> b) {
		//*if(a == null){ 
		//*	throw new IllegalArgumentException("Null value for name is not permitted"); 
		//*	} 
		this.a = a; 
		this.b = b; 
		} 
	
	public String a(){ return a; } 
	public Optional<bugOptional2> b(){ return b; } 
	 

	public String toString() { 
		return "bugOptional1{" + "a=" + a + ", b=" + b +'}'; 
		}

}
