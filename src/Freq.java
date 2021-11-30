import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Freq implements Command{
    @Override
    public String name() {
        return "freq";
    }

    @Override
    public boolean run(Scanner scanner) {
        Path fichierchemin;
        String path;
        String content;
        ArrayList<String> wordtab = new ArrayList<String>();
        int freq[] = new int[100];
        int passage = 0;
        int max = 0;
        Scanner var = new Scanner(System.in);
        path = var.next();
        fichierchemin = Paths.get(path);
        try {
            content = Files.readString(fichierchemin);

            content = content.replaceAll(","," ");
            content = content.replaceAll("\\?"," ");
            content = content.replaceAll("\\!"," ");
            content = content.replaceAll("\\."," ");
            content = content.replaceAll("\\:", " ");
            content = content.replaceAll("\\;", " ");
            content = content.replaceAll("\\'"," ");
            content = content.replaceAll("  "," ");
            content = content.replaceAll("\n"," ");
            content = content.toLowerCase();
            String[] contenttabs = content.split(" ");
            int cpt;
            int indice = 0;
            for(String contenttab : contenttabs) {

                if (!contenttab.isBlank()) {
                    if (!wordtab.contains(content)) {
                        cpt = 0;
                        for (int j = 0; j < contenttabs.length; j++) {
                            if (contenttab.equals(contenttabs[j])) {
                                cpt++;
                            }
                        }
                        freq[indice] = cpt;
                        wordtab.add(contenttab);

                        for (int k = 0; k < freq.length; k++) {
                            if (max < freq[k]) {
                                max = freq[k];
                                passage = k;
                            }
                        }

                    }

                }
                indice += 1;
                //System.out.println(contenttab);
            }
            System.out.println("Le mot le plus utilisé est :" + contenttabs[passage]);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
