package net.lukeiscoding.spigot.simplefireworks.helpers;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

/*
    Simple Fireworks
    A simple to use firework plugin for spigot that also acts as a api for other Spigot developers to use in their project.
    Copyright (C) 2021 Luke Is Coding

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

public class CreateFirework {

    public static void spawnFireWork(Location location, int amount) {
        Location loc = location;
        Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fireworkMeta = fw.getFireworkMeta();

        fireworkMeta.setPower(2);
        fireworkMeta.addEffect(FireworkEffect.builder().withColor(Color.LIME).flicker(true).trail(true).withFade(Color.AQUA).build());

        fw.setFireworkMeta(fireworkMeta);
        fw.detonate();

        for (int i = 0; i < amount; i++) {
            Firework firework = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
            firework.setFireworkMeta(fireworkMeta);
            firework.detonate();
        }
    }
}
