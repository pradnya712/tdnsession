package practise.techdenovo.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * UserInput
 */
public class UserInput {

    public static void main(String[] args) {
        String choice="";
        Domain domain = new Domain();
        while(true){
            System.out.println("*******************");
            System.out.println("Enter option No.");
            System.out.println("A. Administration");
            System.out.println("U. User");
            System.out.println("E. Exit");
            System.out.println("*******************");
            try {
                choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
            } catch (Exception e) {
                System.out.println(e);
            }
            
            switch (choice.toUpperCase()) {
                case "A":
                    System.out.println("Domain Entry/Update");
                    System.out.println("Enter Domain Name: ");
                    try {
                        domain.setDomainName( new BufferedReader(new InputStreamReader(System.in)).readLine());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    break;
                case "U":
                    System.out.println("U. User");
                    String emailid="";
                    try {
                    	System.out.println("Entry email id");
                    	emailid=( new BufferedReader(new InputStreamReader(System.in)).readLine());
                    	int num=emailid.indexOf("@");
                    	String firstpart=emailid.substring(0,num);
                    	System.out.println(firstpart);
                    	String domaiName=emailid.substring(num+1);
                    	if(domaiName.equalsIgnoreCase(domain.getDomainName()))
                    	{
                    		System.out.println("successful");
                    	}else {
                    		System.out.println("only allowed gmail.com");
                    	}
                       }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    break;
                case "E":
                    System.out.println("E.Exit");
                    System.exit(1);
                default:
                    break;
            }
            //System.out.println(" line 60"+domain.getDomainName());
        }
    }
}