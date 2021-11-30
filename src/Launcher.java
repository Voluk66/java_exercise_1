import java.util.*;

public class Launcher {
    public static void main(String[] args){
        int i;
        System.out.println("Bienvenue !");
        Scanner var = new Scanner(System.in);
        boolean Isrunning = true;
        ArrayList<Command> CommandList = new ArrayList<Command>();
        CommandList.add(new Quit());
        CommandList.add(new Fibo());
        CommandList.add(new Freq());
        while (!Isrunning) {
            String UserEntry = var.next();
            for ( i = 0 ; i < CommandList.size(); i++){
                if (UserEntry.toString().equals(CommandList.get(i).name())){
                    

                }
            }

        }

    }
}