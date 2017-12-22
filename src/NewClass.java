
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
public class NewClass {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException{
		HashMap testmap;
                        testmap = new HashMap<>();
                        Iterator entries = testmap.entrySet().iterator();
                        boolean loopAgain = true;
                 Scanner scan = new Scanner(System.in);
                 do{
			System.out.print("Enter ID number:");
			int value = scan.nextInt();
                        float key;
                        int d=11;
                        key = value%d;
                        while (!(testmap.get(key)==null))
                        {
                            key = key+1;
                        }
                        testmap.put(key,value);
                        System.out.println("Your Key Is "+ key);
                        System.out.println("Enter another record (y/n)?");
			String answer = scan.next();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else{
                            float a;
                            System.out.println("Enter the Key: ");
                            a = scan.nextFloat();
                            
                            int result =  Integer.parseInt(testmap.get(a).toString());
                            System.out.println("Key"+"      "+"Value");
                            System.out.println(a+"     "+result);
                            break;
                        }
                        
                 }while (loopAgain);   
                 
                 System.out.println("All Value In HashMap");
                 for (Object key : testmap.keySet()) {
                     Object value = testmap.get(key);
                     System.out.println("Key = " + key + ", Value = " + value);
                    }
    }
}
