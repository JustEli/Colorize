package me.justeli.anvil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Eli on 28 dec 2018.
 * spigotPlugins: me.justeli.inventory
 */
public class OpenAnvil implements Listener
{
    @EventHandler
    public void prepareItem (PrepareAnvilEvent e)
    {
        ItemStack result = e.getResult();
        if (result == null)
            return;

        ItemStack slot = e.getInventory().getItem(1);
        ItemStack original = e.getInventory().getItem(0);
        if (slot == null)
            return;

        ChatColor color = null;
        for (Coloring enumColor : Coloring.values())
            if (slot.getType().equals(enumColor.getMaterial()))
                color = enumColor.getColor();

        if (color == null || original == null)
            return;

        String rename = e.getInventory().getRenameText();
        if (rename.equals(""))
            return;

        ItemStack modify = original.clone();

        ItemMeta meta = modify.hasItemMeta()?
                modify.getItemMeta() : Bukkit.getItemFactory().getItemMeta(modify.getType());

        meta.setDisplayName(color + ChatColor.ITALIC.toString() + rename );
        modify.setItemMeta(meta);

        e.getInventory().setRepairCost(2);
        e.setResult(modify);
    }
}
