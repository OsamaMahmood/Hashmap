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
public class LinearProbing {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException{
        
                //Creating a Non-Generic HashMap
		HashMap IntHashMap = new HashMap<>();
                boolean loopAgain = true;
                 Scanner scan = new Scanner(System.in);
                 
                         for(int i = 0;i<3;i++){
                                System.out.print("Enter Value:");
                                // ask for user input for Value
                                int value = scan.nextInt();
                                int key ;
                                int d=11;
                                key = value%d;
                                //Generating Key from the enter Value
                                     do{
                                           if (IntHashMap.get(key)!=null) {
                                                 key = key+1;  
                                                 continue;
                                         }
                                           else{
                                               IntHashMap.put(key,value); 
                                               break;
                                           }
                                     }while(loopAgain);   
                                     IntHashMap.put(key,value); 
                                     System.out.println(key);
                        }
                 
                 System.out.println("All Value In HashMap");
                 for (Object key : IntHashMap.keySet()) {
                     Object value = IntHashMap.get(key);
                     System.out.println("Key = " + key + ", Value = " + value);
                    }
    }
}