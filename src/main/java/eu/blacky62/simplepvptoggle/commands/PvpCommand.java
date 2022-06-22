package eu.blacky62.simplepvptoggle.commands;

import eu.blacky62.simplepvptoggle.Main;
import eu.blacky62.simplepvptoggle.utils.ConsoleManager;
import eu.blacky62.simplepvptoggle.utils.MessagesManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class PvpCommand implements CommandExecutor {

    private Main plugin;

    public PvpCommand( Main plugin ) {

        this.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            // Il n'y a aucun argument. On retourne l'aide.

/*            for ( String line : plugin.getConfig().getStringList("pvp.messages.command_help")) {

                sender.sendMessage(line);

            }*/

            sender.sendMessage(MessagesManager.formatMultilines(plugin.getConfig().getStringList("pvp.messages.command_help")));
        }

/*        if (sender instanceof Player) {
            return false;
        } else {

            sender.sendMessage("§4You can only use this command as user");
            return false;

        }*/


        return true;
    }

}
