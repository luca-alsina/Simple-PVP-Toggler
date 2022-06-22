package eu.blacky62.simplepvptoggle;

import eu.blacky62.simplepvptoggle.utils.ConsoleManager;
import eu.blacky62.simplepvptoggle.utils.Manager;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    Manager manager = new Manager(this);

    @Override
    public void onEnable() {

        manager.enable();


    }

    @Override
    public void onDisable() {

        manager.disable();

    }
}
