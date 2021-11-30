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
        int index = -1;
        Scanner var = new Scanner(System.in);
        while (!Isrunning) {
            String UserEntry = var.next();
            for ( i = 0 ; i < CommandList.size(); i++){
                if (UserEntry.equals(CommandList.get(i).name())){
                    index = i;

                }
            }
            if (index == -1){
                System.out.println("Unknow Command");
                Isrunning = false;
            }
            else {
                Isrunning = CommandList.get(index).run(var);
            }

        }

    }
}