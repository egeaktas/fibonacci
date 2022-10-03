// fibonacci
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin eleman sayısını giriniz: ");
        int n = input.nextInt();
        int a = 0, b = 1, c;

        if (n == 1){
            System.out.println(0);
        }else if (n == 2){
            System.out.println(0+" "+1);
        }else {
            System.out.print(0+" "+1+" ");
            for (int i = 1; i <= (n-2); i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}

