
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rkm3n
 */
public class HashMapInt {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException{
        
                //Creating a Non-Generic HashMap
		HashMap IntHashMap = new HashMap<>();
                        boolean loopAgain = true;
                 Scanner scan = new Scanner(System.in);
                 
                 // loop while user not entering no
                 
                 do{
			System.out.print("Enter Value:");
                        
                        // ask for user input for Value
                        
			int value = scan.nextInt();
                        float key;
                        int d=11;
                        
                        //Generating Key from the enter Value
                        
                        key = value%d;
                        
                        //Linear probing Function
                        
                        while (!(IntHashMap.get(key)==null))
                        {
                            key = key+1;
                        }
                        
                        //Setting Values in the HashMap
                        
                        IntHashMap.put(key,value);
                        
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
                            
                            float a;
                            System.out.println("Enter the Key: ");
                            a = scan.nextFloat();
                            
                            int result =  Integer.parseInt(IntHashMap.get(a).toString());
                            System.out.println("Key"+"      "+"Value");
                            System.out.println(a+"     "+result);
                            break;
                        }
                        
                 }while (loopAgain);   
                 
                 //Display All Key Value Pairs in the HashMap
                 
                 System.out.println("All Value In HashMap");
                 for (Object key : IntHashMap.keySet()) {
                     Object value = IntHashMap.get(key);
                     System.out.println("Key = " + key + ", Value = " + value);
                    }
    }
}
