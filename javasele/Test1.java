package javasele;

public class Test1 {
	
	public static String n111;
	static int x;
	
	
	
	public void Test1() {
	       
		n111="Tushar Narayan Masne";
        x=230;
	}

	public static void main(String[] args) {
		
     
     System.out.println(n111);
       String m="hello";
     
     
      int l2 = m.length();
      System.out.println(l2);

      for(int i=0; i<=l2-1;i++) {
    	// System.out.println(m.charAt(i));
    	 
    	 if(m.contains("e")) {
    		 
    		String m1 = m.replace('e', '#');
    		
        	  if(m1.contains("o")){
        		  String m2 = m1.replace('o', '#');
        		  System.out.println(m2.charAt(i));
        	 }
        	  else {
        		  
        	  }
        	 

    	 }
    	 else {
    		 
    	 }
    	 
    	
    	 //System.out.println(m.charAt(i));
      
      }
      
	}
   
   
     //System.out.println(n.charAt(i));
	}


