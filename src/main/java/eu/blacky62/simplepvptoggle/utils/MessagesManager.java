package eu.blacky62.simplepvptoggle.utils;

import org.bukkit.ChatColor;

import java.awt.*;
import java.util.List;

public class MessagesManager {

    public static String formatMultilines(List<String> messages) {

        StringBuilder message = new StringBuilder("");

        // On fait une boucle sur la liste des messages en les concaténant en un seul string. Le saut de ligne est ajouté avec le \n à chaque boucle.
        for (String m : messages) {

            message.append("\n").append(m);

        }

        // On retourne le résultat en parsant les couleurs
        return parseColors(message.toString());
    }

    public static String fullParse( String message ) {

        return parseColors(parsePlaceholders(message));

    }

    public static String parseColors( String message ) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String parsePlaceholders(String message) {

    }

}
