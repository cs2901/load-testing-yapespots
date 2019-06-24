package calculator.business;

import calculator.entities.Language;

import java.util.HashMap;
import java.util.Map;

public class TranslatorImpl implements Translator {
    Language from;
    Language to;
    String query;
    Map<String, String> dictionary = new HashMap<String, String>();

    public TranslatorImpl(Language from, Language to) {
        // Español Ingles
        if (from.getId().equalsIgnoreCase("es") && to.getId().equalsIgnoreCase("en")) {
            dictionary.put("perro", "dog");
            dictionary.put("puerta", "door");
            dictionary.put("pizarra", "board");
            dictionary.put("casa", "house");
            dictionary.put("ventana", "window");
            dictionary.put("la", "the");
            dictionary.put("en", "in");
            dictionary.put("esta", "is");
            dictionary.put("hola mundo", "Hello World");
            return;
        }

        if (from.getId().equalsIgnoreCase("en") && to.getId().equalsIgnoreCase("es")) {
            dictionary.put("dog", "perro");
            dictionary.put("door", "puerta");
            dictionary.put("board", "pizarra");
            dictionary.put("casa", "house");
            dictionary.put("window", "ventana");
            dictionary.put("the", "la");
            dictionary.put("in", "en");
            dictionary.put("is", "esta");
            dictionary.put("hello world", "Hola Mundo");
            return;
        }

        // Español Frances
        if (from.getId().equalsIgnoreCase("fr") && to.getId().equalsIgnoreCase("es")) {
            dictionary.put("chien", "perro");
            dictionary.put("chat", "gato");
            dictionary.put("mison", "casa");
            dictionary.put("ecran", "pantalla");
            dictionary.put("et", "esta en");
            dictionary.put("bonjour le monde", "Hola Mundo");
            return;
        }

        if (from.getId().equalsIgnoreCase("es") && to.getId().equalsIgnoreCase("fr")) {
            dictionary.put("perro", "chien");
            dictionary.put("gato", "chat");
            dictionary.put("casa", "mison");
            dictionary.put("pantalla", "ecran");
            dictionary.put("esta en", "et");
            dictionary.put("hola mundo", "Bonjour le monde");
            return;
        }

        //Español Portugues
        if (from.getId().equalsIgnoreCase("es") && to.getId().equalsIgnoreCase("pr")) {
            dictionary.put("perro", "cão");
            dictionary.put("gato", "gato");
            dictionary.put("casa", "lar");
            dictionary.put("pantalla", "tela");
            dictionary.put("esta", "esta");
            dictionary.put("en", "em");
            dictionary.put("hola mundo", "Olá Mundo");
            return;
        }
        if (from.getId().equalsIgnoreCase("pr") && to.getId().equalsIgnoreCase("es")) {
            dictionary.put("cão", "perro");
            dictionary.put("gato", "gato");
            dictionary.put("lar", "casa");
            dictionary.put("tela", "pantalla");
            dictionary.put("esta", "esta");
            dictionary.put("em", "en");
            dictionary.put("olá mundo", "Hola Mundo");
            return;
        }

        // Frances Ingles
        if (from.getId().equalsIgnoreCase("fr") && to.getId().equalsIgnoreCase("en")) {
            dictionary.put("chien", "dog");
            dictionary.put("porte", "door");
            dictionary.put("planche", "board");
            dictionary.put("maison", "house");
            dictionary.put("fenêtre", "window");
            dictionary.put("la", "the");
            dictionary.put("dans", "in");
            dictionary.put("est", "is");
            dictionary.put("bonjour le monde", "Hello World");
            return;
        }

        if (from.getId().equalsIgnoreCase("en") && to.getId().equalsIgnoreCase("fr")) {
            dictionary.put("dog", "chien");
            dictionary.put("door", "porte");
            dictionary.put("board", "planche");
            dictionary.put("house", "maison");
            dictionary.put("window", "la fenêtre");
            dictionary.put("the", "la");
            dictionary.put("in", "dans");
            dictionary.put("is", "est");
            dictionary.put("hello world", "Bonjour le monde");
            return;
        }

        //Frances Portugues
        if (from.getId().equalsIgnoreCase("fr") && to.getId().equalsIgnoreCase("pr")) {
            dictionary.put("chien", "cão");
            dictionary.put("porte", "porta");
            dictionary.put("planche", "borda");
            dictionary.put("maison", "casa");
            dictionary.put("fenêtre", "janela");
            dictionary.put("la", "a");
            dictionary.put("dans", "em");
            dictionary.put("est", "é");
            dictionary.put("bonjour le monde", "Olá Mundo");
            return;
        }

        if (from.getId().equalsIgnoreCase("pr") && to.getId().equalsIgnoreCase("fr")) {
            dictionary.put("cão", "chien");
            dictionary.put("porta", "porte");
            dictionary.put("borda", "planche");
            dictionary.put("casa", "maison");
            dictionary.put("janela", "la fenêtre");
            dictionary.put("aes", "la");
            dictionary.put("em", "dans");
            dictionary.put("é", "est");
            dictionary.put("olá mundo", "Bonjour le monde");
            return;
        }

        //Ingles portugues
        if (from.getId().equalsIgnoreCase("pr") && to.getId().equalsIgnoreCase("en")) {
            dictionary.put("cão", "dog");
            dictionary.put("porta", "door");
            dictionary.put("borda", "board");
            dictionary.put("casa", "house");
            dictionary.put("janela", "window");
            dictionary.put("aes", "the");
            dictionary.put("em", "in");
            dictionary.put("é", "is");
            dictionary.put("olá mundo", "Hello World");
            return;
        }

        if (from.getId().equalsIgnoreCase("en") && to.getId().equalsIgnoreCase("pr")) {
            dictionary.put("dog", "cão");
            dictionary.put("door", "porta");
            dictionary.put("board", "borda");
            dictionary.put("house", "casa");
            dictionary.put("window", "janela");
            dictionary.put("the", "aes");
            dictionary.put("in", "em");
            dictionary.put("is", "é");
            dictionary.put("hello world", "Olá Mundo");
        }
    }


    @Override
    public String translate(Language from, Language to, String text) {
        query = text.toLowerCase();
        //query = query.replaceAll("[^a-zA-Z0-9]", "");
        String translation = dictionary.get(query);

        return translation;
    }
}
