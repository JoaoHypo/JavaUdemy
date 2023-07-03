import java.util.Scanner;
public class dataentry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v;
        String x,y,z;


        v = sc.nextInt();
        sc.nextLine();//nextline para resolver o dado pendente que fica em branco
        x = sc.nextLine();
        y = sc.nextLine();
        z = sc.nextLine();


        System.out.println("Você digitou: ");
        System.out.println(v);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }
}
