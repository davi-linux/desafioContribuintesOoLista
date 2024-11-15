
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mr.Mendes
 */
public class ProgramPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     TaxPayer tx = new TaxPayer(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

     
    System.out.print("Quantos contribuintes voce vai digitar? ");
    int x = sc.nextInt();
    
    tx.initialProgram(x);
    tx.salaryTax();
    tx.servicesTax();
    tx.capitalTax();
    tx.grossTax();
    tx.taxRebate();
     
     tx.resumoContribuintes();
   
     
     
     
     
     
     sc.close();
    
    }
    
}
