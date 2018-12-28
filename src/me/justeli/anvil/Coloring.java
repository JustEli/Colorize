package me.justeli.anvil;

import org.bukkit.ChatColor;
import org.bukkit.Material;

/**
 * Created by Eli on 27 dec 2018.
 * spigotPlugins: me.justeli.colors
 */
public enum Coloring
{
    BLACK (ChatColor.BLACK, Material.INK_SAC),
    DARK_BLUE (ChatColor.DARK_BLUE, Material.LAPIS_LAZULI),
    DARK_GREEN (ChatColor.DARK_GREEN, Material.CACTUS),
    DARK_AQUA (ChatColor.DARK_AQUA, Material.CYAN_DYE),
    DARK_RED (ChatColor.DARK_RED, Material.POPPY),
    DARK_PURPLE (ChatColor.DARK_PURPLE, Material.PURPLE_DYE),
    GOLD (ChatColor.GOLD, Material.ORANGE_DYE),
    GRAY (ChatColor.GRAY, Material.LIGHT_GRAY_DYE),
    DARK_GRAY (ChatColor.DARK_GRAY, Material.GRAY_DYE),
    BLUE (ChatColor.BLUE, Material.LIGHT_BLUE_DYE),
    GREEN (ChatColor.GREEN, Material.LIME_DYE),
    AQUA (ChatColor.AQUA, Material.MAGENTA_DYE),
    RED (ChatColor.RED, Material.COCOA_BEANS),
    LIGHT_PURPLE (ChatColor.LIGHT_PURPLE, Material.PINK_DYE),
    YELLOW (ChatColor.YELLOW, Material.DANDELION_YELLOW),
    WHITE (ChatColor.WHITE, Material.BONE_MEAL);

    private ChatColor color;
    private Material material;

    Coloring (ChatColor color, Material material)
    {
        this.color = color;
        this.material = material;
    }

    public ChatColor getColor ()
    {
        return this.color;
    }

    public Material getMaterial ()
    {
        return this.material;
    }
}
