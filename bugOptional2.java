package javaSamples.bug_Optional;

public class bugOptional2 {
	
	public static final bugOptional2 EMPTY_bugOptional2 = new bugOptional2("","");
	private final String l;
	private final String c;
	
	public bugOptional2(String l, String c) { 
		this.l = l; 
		this.c = c;	
		} 
	
	public String l(){ return l; } 
	public String c(){ return c; } 
	
    public String toString() { 
		return "bugOptional2{" + "l=" + l+ ", c=" + c + "}";
		}

}
