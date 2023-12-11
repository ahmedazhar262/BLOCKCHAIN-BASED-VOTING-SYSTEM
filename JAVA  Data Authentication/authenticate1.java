import java.util.*;

public class Blockchain_Based_Voting_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // userAadhar
        int[] aadhar = {7, 14, 18, 30};
        
        System.out.println("........BLOCKCHAIN BASED VOTING SYSTEM........\n\n");
        System.out.println("Submitted by:                        Submitted to:\n.........................            .........................\nAshish Kumar                         Mr. Abhishek Tripathi\nAditya Pandey\nFarhan Ahmad\nMohammad Azharuddin\n\n");
       

        // Ask the user if they want to add the new Aadhar
        System.out.println("Please, Enter your Aadhar No: ");
        int data1 = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        

        // checkAadhar
        boolean isAadharMatched = false;
        for (int i = 0; i < aadhar.length; i++) {
            if (aadhar[i] == data1) {
                isAadharMatched = true;
                break; // No need to continue checking once a match is found
            }
        }
        switch(data1){
        case 786:   // Display existing Aadhar numbers
        System.out.println("Existing Aadhar Numbers: " + Arrays.toString(aadhar));
break;
        }

        if (isAadharMatched) {
            System.out.println("Aadhar Successfully Matched");
            System.out.println("\n\n ..............Please, Scan your @fingerprint. ............. ");
            String fingerprint = sc.nextLine(); // Use String for fingerprint

            // usingSecond aadhar1 with linked @fingerprint
            String[] aadhar2 = {"Ashish Kumar", "Aditya Pandey", "Farhan Ahmad", "Mohammad Azharuddin"};

            for (int j = 0; j < aadhar2.length; j++) {
                if (aadhar2[j].equals(fingerprint)) { // Use equals() to compare strings
                    System.out.println("SUCCESSFULLY, @login\n \n\n .......you can vote now");

                    // allParties name
                    String[] parties = {"BBDNIIT", "BBDNITM", "BBDEC", "BBDUniversity"};
                    int BBDNIIT = 775;
                    int BBDNITM = 550;
                    int BBDEC = 210;
                    int BBDUniversity = 772;

                    // printParties name
                    for (int i = 0; i < parties.length; i++) {
                        System.out.println(parties[i]);
                    }

                    // Add the rest of your voting logic here
                }
            }
        } else {
            // Ask the user if they want to add the new Aadhar
            System.out.println("Aadhar Not Registered\nDo you want to add this Aadhar? (1 for Yes, 0 for No): ");
            int addAadhar = sc.nextInt();

            if (addAadhar == 1) {
                // Resize the array and add the new Aadhar
                int[] newAadhar = Arrays.copyOf(aadhar, aadhar.length + 1);
                newAadhar[newAadhar.length - 1] = data1;
                aadhar = newAadhar;

                System.out.println("Aadhar Successfully Added");
                System.out.println("Updated Aadhar Numbers: " + Arrays.toString(aadhar));

                // Continue with the Aadhar matching logic if needed
            } else {
                System.out.println("Aadhar not added. Kindly Register Aadhar if needed.");
                // Add a return statement to end the program
                return;
            }
        }
    }
}
