package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document, String[] parameters) {
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

        this.document.majuscules(int1, int2);
        super.executer();
    }
}
