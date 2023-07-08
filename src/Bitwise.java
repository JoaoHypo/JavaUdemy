import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int n1;
//sample to check the six'th bit of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga qual número queres avaliar o sexto binário?");
        n1 = sc.nextInt();
        // 32 in bin its 0010 0000, so if we do bitwise & with any number,
        // we can evaluate if this number in bin has it's six'th value

        if ((n1 & 0b00100000) == 32){
            System.out.printf("%d 6th bit is True",n1);
        }
        else{
            System.out.printf("%d 6th bit is False",n1);}
        //System.out.println(n1 & n2);
        //System.out.println(n1 | n2);
        //System.out.println(n1 ^ n2);
    }
}
