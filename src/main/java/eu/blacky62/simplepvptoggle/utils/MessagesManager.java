package eu.blacky62.simplepvptoggle.utils;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.awt.*;
import java.util.List;

public class MessagesManager {

    public static String formatMultilines(Player player, List<String> messages) {

        StringBuilder message = new StringBuilder("");

        // On fait une boucle sur la liste des messages en les concaténant en un seul string. Le saut de ligne est ajouté avec le \n à chaque boucle.
        for (String m : messages) {

            message.append("\n").append(m);

        }

        // On retourne le résultat en parsant les couleurs
        return fullParse(player, message.toString());
    }

    public static String fullParse(Player player, String message) {

        return parseColors(parsePlaceholders(player, message));

    }

    public static String parseColors( String message ) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String parsePlaceholders(Player player, String message) {
        return PlaceholderAPI.setPlaceholders(player, message);
    }

}
