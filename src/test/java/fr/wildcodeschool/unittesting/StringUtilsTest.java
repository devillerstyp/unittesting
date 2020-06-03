package fr.wildcodeschool.unittesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsTest {
    @Test
    //test lorsque aucune valeurs n'est rentrée:null/
    public void testVowels1(){
        Assertions.assertNull(StringUtils.vowels(""));
    }

    @Test
    //test pour vérifier si les espaces renvoie une zone vide lorsque le message n'a pas de lettres:/
    public void emptyZone(){
        String testMessage = "   ";
        Assertions.assertEquals("",StringUtils.vowels(testMessage));
    }
    @Test
    //test pour vérifier si la  chaine de caractère renvoie que les voyelles:/
    public void spaceAndString(){
        String testMessage2 = "eleganceougtro i";
        Assertions.assertEquals("eeaeouoi",StringUtils.vowels(testMessage2));
    }
    @Test
    //Test pour vérifier que la méthode 'uniqueVowels', renvoie un message d'erreur si le message contient des consoles:/
    public void withOutVowels(){
        String testWithOutVowels = "CDFGHJKLMNPQRSTVWXZ";
        Assertions.assertEquals("", StringUtils.uniqueVowels(testWithOutVowels));
    }

    @Test
    //test pour vérifier que la méthode 'uniqueVowels', ne renvoie pas d'occurence:/
    public void notDouble(){
        String testDoublons = "Place athen";
        Assertions.assertEquals("ae", StringUtils.uniqueVowels(testDoublons));
    }



}
