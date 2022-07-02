package net.hyzercoder.hnoplacehead;

import lombok.val;
import org.bukkit.SkullType;
import org.bukkit.block.Skull;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class NoPlace implements Listener {
    @EventHandler
    public void noPlace(final BlockPlaceEvent e) {
        val block = e.getBlockPlaced();
        val state = block.getState();

        if (state != null && state instanceof Skull) {
            if (((Skull) state).getSkullType() == SkullType.PLAYER) {
                e.setCancelled(true);
            }
        }
    }
}
