package eu.blacky62.simplepvptoggle.utils;

import eu.blacky62.simplepvptoggle.Main;
import eu.blacky62.simplepvptoggle.commands.RegisterCommands;
import org.bukkit.Bukkit;

public class Manager {

    private Main instance;

    private Manager manager;

    private RegisterCommands commands;

    public Manager(Main instance) {

        this.instance = instance;
        this.manager = this;
        this.commands = new RegisterCommands(instance);

    }

    public void enable() {

        ConsoleManager.setColor("green");
        ConsoleManager.sendMessage("[SPT] Plugin enabled !");

        try {
            commands.register();
        } catch (Exception e) {
            ConsoleManager.setColor("red");
            ConsoleManager.sendMessage("[SPT] Error registering commands : ");
            ConsoleManager.setColor("darkred");
            ConsoleManager.sendMessage(e.getMessage());

        }

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            /*
             * We register the EventListener here, when PlaceholderAPI is installed.
             * Since all events are in the main class (this class), we simply use "this"
             */
            Bukkit.getPluginManager().registerEvents(instance, instance);
        } else {
            /*
             * We inform about the fact that PlaceholderAPI isn't installed and then
             * disable this plugin to prevent issues.
             */
            instance.getLogger().severe("Could not find PlaceholderAPI! This plugin is required.");
            Bukkit.getPluginManager().disablePlugin(instance);
        }

        ConsoleManager.setColor("green");
        ConsoleManager.sendMessage("[SPT] Commands enabled !");

    }

    public void disable() {

        ConsoleManager.setColor("gold");
        ConsoleManager.sendMessage("[SPT] Plugin disabled !");

    }

}
