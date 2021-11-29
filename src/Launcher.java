import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        int f0=0,f1=1,fn=0, i;
        System.out.println("Bienvenue !");
        java.util.Scanner var = new java.util.Scanner(System.in);
        String Argument = var.nextLine();
        while (!Argument.equals("quit")){
            if (Argument.equals("fibo")){
                int nbr = var.nextInt();

                for (i=2;i < nbr+1 ;i++){
                    fn = f1 + f0;
                    f0 = f1;
                    f1 = fn;
                }
                System.out.println(" "+fn);
            }
            else {
                System.out.println("Unknow Command");
            }
            Argument = var.nextLine();
        }

    }
}