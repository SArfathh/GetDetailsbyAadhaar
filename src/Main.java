import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Aadhaar Number: ");
        String aadhaarNumber = sc.nextLine();

        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

        if(aadhaar!= null && pan!= null){
            System.out.println(aadhaar);
            System.out.println(pan);
        }
        else{
            System.out.println("No Match Found....");
        }



    }
}