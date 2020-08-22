import org.junit.Test;
import org.junit.Assert;

public class StringStackTest {

	StringStack t= new StringStack();
	StringStackMutant mutant= new StringStackMutant();
	@Test
	public void isEmptyTest() {        
		Assert.assertEquals(true,t.isEmpty());
	}
	
	@Test
	public void isNotEmptyTest() {
		t.push("push 1 element");
		Assert.assertFalse(t.isEmpty());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void popExceptioinTest() {
		t.pop();
	}

	@Test (expected=IllegalArgumentException.class)
	public void pushExceptionTest() 
	{
		String[] arraystr=new String[]{"a","b","c","d","e","f","g","h","i","j","11th_element"};
		for(String obj: arraystr) {
			
			t.push(obj);
			
		}
	}
	
	@Test
	public void pushTest() {
		t.push("push success");
		Assert.assertNotNull(t);
	}

	@Test 
	public void popTest() {
		t.push("pop success");
		Assert.assertEquals("pop success",t.pop());
	}
	//Mutation testing
	@Test 
	public void isEmptyMutantTest() {        
		Assert.assertEquals(true,mutant.isEmpty());
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void popExceptioinMutantTest() {
		mutant.pop();
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void pushExceptionMutantTest()
	{
       String[] arraystr=new String[]{"a","b","c","d","e","f","g","h","i","j","11th_element","12th_element","13th_element"};
	   for(String obj: arraystr) {
	    	mutant.push(obj);
	    	
	    }
	}
	
	@Test
	public void pushMutantTest() {
     mutant.push("push success");
     Assert.assertNotNull(mutant);
	}
	
	@Test 
	public void popMutantTest() {
		mutant.push("pop success");
		Assert.assertEquals("pop success",mutant.pop());
	}
}
