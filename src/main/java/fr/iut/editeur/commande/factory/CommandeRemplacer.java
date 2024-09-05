package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }


    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }

        int int1 = Integer.parseInt(parameters[1]);
        int int2 = Integer.parseInt(parameters[2]);
        String texte = parameters[3];

        try  {
            texte = parameters[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            texte = "";
        }

        this.document.remplacer(int1, int2, texte);
        super.executer();
    }
}

