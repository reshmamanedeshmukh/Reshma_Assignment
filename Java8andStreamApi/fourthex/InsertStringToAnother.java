package com.yash.fourthex;





interface MyInterface {
    String InsertAnoterString(String originalString,
            String stringToBeInserted,
            int index);
}
public class InsertStringToAnother {
	public static void main(String[] args) {
			
		String originalString = "this is program";
        String stringToBeInserted = "java";
        int index = 6;
  
        System.out.println("Original String: "
                           + originalString);
        System.out.println("String to be inserted: "
                           + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                           + index);
  
        MyInterface min;
        min=(str,insertedstr,i)->{
        	// Create a new StringBuffer
            StringBuffer newString
                = new StringBuffer(originalString);
      
            // Insert the strings to be inserted
            // using insert() method
            newString.insert(index + 1, stringToBeInserted);
      
            // return the modified String
            return newString.toString();
        	
        };
        
       String newString= min.InsertAnoterString(originalString, stringToBeInserted, index);
       
       System.out.println(newString);
		  
	}

}