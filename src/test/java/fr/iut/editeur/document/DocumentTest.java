package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import fr.iut.editeur.commande.Commande;
import fr.iut.editeur.commande.factory.CommandeFactory;
import fr.iut.editeur.commande.invoker.CommandeInvoker;

import static org.junit.jupiter.api.Assertions.*;

  public class DocumentTest {

      @Test
      public void testMethode() {
        Document document = new Document();
        CommandeInvoker invoker = CommandeInvoker.getInstance();
        CommandeFactory factory = CommandeFactory.getInstance();
        String input = "ajouter;hello world!";
        String[] parameters = input.split(";");
        String nomCommande = parameters[0];
        Commande commande = factory.createCommand(nomCommande, document, parameters);
        assertEquals("hello world!", "hello world!");
      }
  }
