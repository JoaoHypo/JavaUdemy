public class exec1 {
    public static void main(String[] args) {

        String prod1 = "Computer";
        String prod2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F'; //Unicode only one  ' '

        double price1 = 2100.00;
        double price2 = 650.00;
        double measure = 53.234567;

        System.out.println("Product:");
        System.out.printf("%s, which price is $ %.2f .%n",prod1,price1);
        System.out.printf("%s, which price is $ %.2f .%n", prod2, price2);

        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n",age,code, gender);

        System.out.printf("%nMeasure with eight decimal places: %.8f%n",measure);
        System.out.printf("Rounded (three decimal places): %.3f",measure);

    }
}
