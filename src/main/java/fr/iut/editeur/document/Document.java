package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        if (debut < 0 || fin >= texte.length() || debut >= fin) {
            throw new IllegalArgumentException("Indices invalides");
        }

        String portion = texte.substring(debut, fin + 1);
        String portionMajuscules = portion.toUpperCase();

        remplacer(debut, fin, portionMajuscules);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
