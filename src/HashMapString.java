
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rkm3n
 */
public class HashMapString {
    public static void main(String[] args) throws InterruptedException{
        
                //Creating a Non-Generic HashMap
		HashMap StringHashMap = new HashMap<>();
                        boolean loopAgain = true;
                 Scanner scan = new Scanner(System.in);
                 
                 // loop while user not entering no
                 
                 do{
			System.out.print("Enter Your Name:");
                        
                        // ask for user input for Value
                        
			String value = scan.next();
                        int ascii = 0;
                        float key;
                        int d=11;
                       
                        //Converts the string value to ASCII
                        
                       for (int i=0; i<value.length();i++){
                           ascii = ascii+(int)value.charAt(i);
                           }
                        
                        
                        //Generating Key from the enter Value
                        
                        key = ascii%d;
                        
                        //Linear probing Function
                        
                        while (!(StringHashMap.get(key)==null))
                        {
                            key = key+1;
                        }
                        
                        //Setting Values in the HashMap
                        
                        StringHashMap.put(key,value);
                        
                        //Displaying Key after Insertion
                        
                        System.out.println("Your Key Is "+ key);
                        
                        //Insert an other key value in the HashMap
                        
                        System.out.println("Enter another record (y/n)?");
			String answer = scan.next();
                        
                        // condition to satisfy in order to loop again
                        
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else{
                            
                            //Function to find the value from HashMap for given key
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            float a;
                            System.out.println("Enter the Key: ");
                            a = scan.nextFloat();
                            System.out.println("");
                            System.out.println("");
                
                            Object result =  StringHashMap.get(a);
                            System.out.println("Key"+"      "+"Value");
                            System.out.println(a+"     "+result);
                            break;
                        }
                        
                 }while (loopAgain);   
                 
                 //Display All Key Value Pairs in the HashMap
                 System.out.println("");
                 System.out.println("");
                 System.out.println("All Value In HashMap");
                 for (Object key : StringHashMap.keySet()) {
                     Object value = StringHashMap.get(key);
                     System.out.println("Key = " + key + ", Value = " + value);
                    }
    }
}