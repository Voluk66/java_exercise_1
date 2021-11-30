import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args){
        int f0=0,f1=1,fn=0, i;
        System.out.println("Bienvenue !");
        java.util.Scanner var = new java.util.Scanner(System.in);
        String Argument = var.nextLine();
        Path fichierchemin;
        String path;
        String content;
        ArrayList<String> wordtab = new ArrayList<String>();
        int freq[] = new int[100];
        int passage = 0;
        int max = 0;
        while (!Argument.equals("quit")){
            if (Argument.equals("fibo")){
                int nbr = var.nextInt();
                for (i=2;i < nbr+1 ;i++){
                    fn = f1 + f0;
                    f0 = f1;
                    f1 = fn;
                }
                f0=0;
                f1=1;
                System.out.println(""+fn);
            }
            if (Argument.equals("freq")){
                //todo des choses sombres
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
            }
            else {
                System.out.println("Unknow Command");
            }
            Argument = var.next();
        }

    }
}