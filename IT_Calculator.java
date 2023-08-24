import java.util.Scanner; 

  

public class IT_Calculator { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

         

        System.out.print("Enter Taxable Income: "); 

        double taxableIncome = scanner.nextDouble(); 

         

        double taxRate; 

        if (taxableIncome <= 25000) { 

            taxRate = 0.0; 

        } else if (taxableIncome <= 50000) { 

            taxRate = 0.1; 

        } else if (taxableIncome <= 75000) { 

            taxRate = 0.2; 

        } else { 

            taxRate = 0.3; 

        } 

         

        double taxPaidPerYear = taxableIncome * taxRate; 

        double taxPayablePerMonth = taxPaidPerYear / 12; 

         

        System.out.println("Tax Paid Per Year: $" + taxPaidPerYear); 

        System.out.println("Tax Payable Per Month: $" + taxPayablePerMonth); 

         

        scanner.close(); 

    } 

} 