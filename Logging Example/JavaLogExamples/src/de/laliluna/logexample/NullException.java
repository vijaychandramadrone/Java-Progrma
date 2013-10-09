package de.laliluna.logexample;

public class NullException {

	/**
	 * @param args
	 */
	Integer num = null;
	public void doSomething()
	{
	 try{
	  num = num+10;
	 }
	 catch(Exception e)
	 {
		 throw new NullPointerException("I m Null Exception");
	 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullException ne = new NullException();
		ne.doSomething();
	}

}
