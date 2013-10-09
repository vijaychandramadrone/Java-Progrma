class variablelenght{

  public static void main(String args[]){
    variablelenght vl = new variablelenght();
	vl.hello("vijay","chandra","kondamudi","ravi");
  }
  public void hello(String...parameters){
    for(String s:parameters){
	  System.out.println(s);
	}
  } 
}