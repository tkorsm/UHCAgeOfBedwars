package uhcageofbedwars.uhcageofbedwars;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello world! 3");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
