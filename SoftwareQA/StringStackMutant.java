public class StringStackMutant {
	private int capacity = 10;
	private int pointer = 0;
	private String[] objects = new String[capacity];
	
	 public void push(String o) {
	 // pointer=12; 
	/*killed by pushMutantTest. Comment this to get pushExceptionMutant successful 
		 and uncomment to get pushMutant successful.
	/* Both pushmutant and pushexception mutant will not 
	 execute at the same time due to opposite conditions. so comment one mutant to get one mutant successful*/
	  if (pointer >= capacity)
	  {
		
		 throw new IllegalArgumentException("Stack exceeded capacity!");
	  }
	
	 objects[pointer++] = o;
	 pointer--;  //killed by pushExceptionMutantTest. It holds always. no need to comment.
	 }
	
	 public String pop() {
		// if (pointer <= 0)
		 pointer++;  //killed by popExceptioinMutantTest testcase
		 if (pointer <= 0)
			 throw new IllegalArgumentException("Stack empty");
		// return objects[--pointer];
		 return objects[pointer]; //killed by popMutantTest testcase
		 
	 }
	
	 public boolean isEmpty() {
		// return pointer <= 0; 
		 return pointer >0; // killed by isEmptyTestMutant testcase
	 }
}
