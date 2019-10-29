package javaSamples.bug_Optional;

import static org.junit.Assert.assertEquals;
import java.util.Optional;

public class bugOptionlMain {

	public static void main(String[] args) {
		
		bugOptional2 test2 = new bugOptional2(null, null); 
		bugOptional1 test1 = new bugOptional1("a",Optional.of(test2));
		//Optional.of() returns an Optional with the specified present non-null value,which in this case is null!
		
		Optional<bugOptional2> op = test1.b();
		if(op != null){ 
			System.out.println(test1); 
		} 
		//it will throw any NullPointerException
  		
		if(!op.isPresent()){
			 System.out.println(test1);
			}
		//This is not recommended because it is similar to classical check
	
	}
	
	public void whenCreateEmptyOptional_thenNull() {
	    Optional<bugOptional2> emptyOpt = Optional.empty();
	    emptyOpt.get();
	    /* attempting to access the value of the emptyOpt variable results in a NoSuchElementException.
	     To create an Optional object that can contain a value – you can use the of()
	     Optional<bugOptional2> emptyOpt = Optional.of(); 
	     */
	}
	
	public void whenCreateOfNullableOptional_thenOk() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    
	    assertEquals("", opt.get());
	    /*this method throws an exception
	    To avoid this exception, you can choose to first verify if a value is present or not
	    */
	}
	public void missingIsPresent() {
		bugOptional4 p = new bugOptional4("string", new bugOptional3("x","y")); 
		bugOptional3 a = p.getBugOptional3(); 
		if(a != null){ System.out.println(p); }
		 

	}

	

}
