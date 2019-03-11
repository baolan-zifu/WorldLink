package cat.nyaa.worldlink;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldLink extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        //todo
    }
    @Override
    public void onLoad() {
        getDataFolder().mkdirs();
        //todo
    }
    public void loadConfig() {
        //todo
    }
    private void registerCommands() {
        //todo
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);
        //todo
    }
    @Override
    public void onDisable() {
        super.onDisable();
        //todo
    }
}
