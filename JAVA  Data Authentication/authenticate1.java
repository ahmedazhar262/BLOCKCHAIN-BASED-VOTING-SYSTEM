import java.util.*;

public class Blockchain_Based_Voting_System{
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);
        
        // userInput
        System.out.println("Please, Enter your AADHAR No: ");
        int data1= sc.nextInt(); 

        // userAadhar 
        long int [] aadhar= {2000560130007, 2000560130014, 2000560130018, 2000560130030};

        // checkAadhar
        for(int i=0; i<aadhar.length(); i++){
            if(data1==aadhar){
                System.out.println("Aadhar Successfully Matched");
            }
        }



    }
}