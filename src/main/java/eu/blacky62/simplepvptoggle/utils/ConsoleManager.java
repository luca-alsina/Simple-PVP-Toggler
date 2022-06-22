package eu.blacky62.simplepvptoggle.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.lang.reflect.Array;

public class ConsoleManager {

    private static ChatColor consoleColor = ChatColor.WHITE;

    public static void setColor(String color) {

        color = color.toLowerCase();


        switch (color) {
            case "red" :
                consoleColor = ChatColor.RED;
                break;
            case "darkred" :
                consoleColor = ChatColor.DARK_RED;
                break;
            case "blue" :
                consoleColor = ChatColor.BLUE;
                break;
            case "green" :
                consoleColor = ChatColor.GREEN;
                break;
            case "orange" :
                consoleColor = ChatColor.GOLD;
            case "gold" :
                consoleColor = ChatColor.GOLD;
            default :
                consoleColor = ChatColor.WHITE;
        }

    }

    public static void sendMessage( String message ) {

        Bukkit.getConsoleSender().sendMessage(consoleColor + message);

    }
    
    public static void sendMultiplesMessages(String[] messages ) {

        for ( String message : messages ) {

            Bukkit.getConsoleSender().sendMessage(consoleColor + message);

        }
        
    }

}
