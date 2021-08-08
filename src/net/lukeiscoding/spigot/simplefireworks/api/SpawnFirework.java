package net.lukeiscoding.spigot.simplefireworks.api;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.World;
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

public class SpawnFirework {


    /**
     * <p>Creates a firework with the specified location, color and flicker.</p>
     * @param x The X position of the world that you want to position the firework.
     * @param y The Y position of the world that you want to position the firework.
     * @param z The Z position of the world that you want to position the firework.
     * @param world The world you want the firework to spawn in.
     * @param color The color of the firework.
     * @param flicker Boolean flicker on or off.
     * @param power The power of the firework.
     */
    public void spawnFirework(double x, double y, double z, World world, Color color, boolean flicker, int power) {
        // create a new location from the x, y, and z arguments.
        Location location = new Location(world, x, y, z);

        // create the firework.
        Firework firework = (Firework) location.getWorld().spawnEntity(location, EntityType.FIREWORK);

        // create the firework meta.
        FireworkMeta fireworkMeta = firework.getFireworkMeta();

        // create the firework.
        fireworkMeta.setPower(power);
        fireworkMeta.addEffect(FireworkEffect.builder().withColor(color).flicker(flicker).build());

        // set the firework meta to the firework.
        firework.setFireworkMeta(fireworkMeta);

        // detonate.
        firework.detonate();
    }
}
