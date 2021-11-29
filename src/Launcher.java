import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("Bienvenue !");
        java.util.Scanner var = new java.util.Scanner(System.in);
        String Argument = var.nextLine();
        if (Argument.equals("quit")){
            return;
        }
        else {
            System.out.println("Unknow Command");
            return;
        }
    }
}