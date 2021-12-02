import java.util.Scanner;

public class Fibo implements Command{
    @Override
    public String name() {
        return "fibo";
    }

    @Override
    public boolean run(Scanner scanner) {
        int f0 = 0, f1 = 1,f2 = 0;
        scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();
        for (int i = 2; i < nbr+1 ; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        System.out.println(f2);
        f0 = 0;
        f1 = 1;
        return false;
    }
}
