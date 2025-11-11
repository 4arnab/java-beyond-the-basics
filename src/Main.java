import java.util.Arrays;

public class Main {
   public static enum Gender{
        MALE,
        FEMAle
    }
    public final String NAME = "UNCHANGED variable"; // constant
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println(Arrays.toString(args));
        }

        System.out.println(Gender.valueOf("MALE"));

        char grade = 'A';

        String result = switch (grade){
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Pass";
            default -> "Failed";
        };
        System.out.println(result);

        int addResult = add(10,200);
        System.out.println(addResult);
        transformText("axmed abdifatah mohamed", 2);
        transformText("axmed abdifatah ", 1);
        System.out.println(        rentalYieldCalculator(1_300, 250_000));
        System.out.println(        rentalYieldCalculator(8000, 23_400));

    }

    private static void transformText(String text, int form){
            String result = switch (form){
            case 1 -> text.toUpperCase();
            case 2 -> text.toLowerCase();
            default -> text;
        };

        System.out.println(result);
    }
    private static int add(int a, int b){
        String myName = "ahmedarnab".toUpperCase();
        System.out.println(myName);
        return  a + b;
    }

    private static double rentalYieldCalculator(double monthlyIncome, double propertyPrice){
        double annualRentalIncome = monthlyIncome * 12;
        return  (annualRentalIncome / propertyPrice) * 100;
    }
}
