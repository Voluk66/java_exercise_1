import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Predict implements Command{
    @Override
    public String name() {
        return "predict";
    }

    @Override
    public boolean run(Scanner scanner) {
        System.out.println("Entrez le chemin du fichier");
        String path = scanner.next();
        Path FilePath = Paths.get(path);
        try {
            String content = Files.readString(FilePath).toLowerCase(Locale.ROOT);
            System.out.println("Lecture Réussis !!!");
            //todo faire le T9
            String[] Tabofcontents = content.split(" ");
            System.out.println("Entrez un mot");
            String mot = scanner.next();
            boolean isIn = false;
            for (String word : Tabofcontents){
                if (word.equals(mot)){
                   isIn = true;
                }
            }
            if (isIn){
                //Todo Faire la prediction des 20 mots
                System.out.println("Le mots est bien present dans le texte");
            }
            else{
                System.out.println("Le mot n'est pas present dans le texte");
            }
        } catch (Exception e) {
            System.out.println("Unreadable File: "+ e);
        }
        return false;
    }
}
