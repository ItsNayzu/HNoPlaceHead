package net.hyzercoder.hnoplacehead;

import org.bukkit.plugin.java.JavaPlugin;

public final class HNoPlaceHead extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoPlace(), this);

        getLogger().info("§d❤ §7Author: §5§nItsNayzu");
        getLogger().info("§d☄ §7Version: §51.0");
        getLogger().info("§d► §7Creator Community: §5&lvk.com/hyzerstudio");
        getLogger().info("§d◉ §7Official sources:");
        getLogger().info("§9GitHub: §7- §dhttps://github.com/ItsNayzu/HNoPlaceHead");
        getLogger().info("§eSpigot: 7- §");
        getLogger().info("§d");
        getLogger().info("§d");



    }

    @Override
    public void onDisable() {
        getLogger().info("§dGod bye");

    }
}
