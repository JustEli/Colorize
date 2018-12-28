package me.justeli.colorize;

import me.justeli.anvil.OpenAnvil;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Eli on 27 dec 2018.
 * spigotPlugins: me.justeli.colorize
 */
public class Colorize extends JavaPlugin
{
    @Override
    public void onEnable ()
    {
        registerEvents();
    }

    private void registerEvents ()
    {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new OpenAnvil(), this);
    }
}
