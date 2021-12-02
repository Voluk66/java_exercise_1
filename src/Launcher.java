import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        int i;
        System.out.println("Bienvenue !");

        boolean Isrunning = false;
        ArrayList<Command> CommandList = new ArrayList<>();
        CommandList.add(new Quit());
        CommandList.add(new Fibo());
        CommandList.add(new Freq());
        CommandList.add(new Predict());
        int index;
        Scanner var = new Scanner(System.in);
        while (!Isrunning) {
            index = -1;
            String UserEntry = var.next();
            for ( i = 0 ; i < CommandList.size(); i++){
                if (UserEntry.equals(CommandList.get(i).name())){
                    index = i;
                }
            }
            if (index == -1){
                System.out.println("Unknown Command");
            }
            else {
                Isrunning = CommandList.get(index).run(var);
                System.out.println("Fin de fonction");
            }
        }
    }
}