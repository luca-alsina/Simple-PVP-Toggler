package eu.blacky62.simplepvptoggle.commands;

import eu.blacky62.simplepvptoggle.Main;
import org.bukkit.command.CommandExecutor;

import java.util.Objects;

public class RegisterCommands {

    private final Main instance;

    public RegisterCommands( Main instance ) {

        this.instance = instance;

    }

    public void register() {

        Objects.requireNonNull(instance.getCommand("pvp")).setExecutor(new PvpCommand(instance));

    }

}
