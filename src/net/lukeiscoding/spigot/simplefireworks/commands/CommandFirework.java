package net.lukeiscoding.spigot.simplefireworks.commands;

import net.lukeiscoding.spigot.simplefireworks.api.SpawnFirework;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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

public class CommandFirework implements CommandExecutor {

    private static final SpawnFirework spawnFirework = new SpawnFirework();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // cast the command sender to a player
        Player p = (Player) sender;

        if (sender.hasPermission("simplefireworks.firework") && p.hasPermission("simplefireworks.firework")) {
            if (cmd.getName().equalsIgnoreCase("firework")) {
                spawnFirework.spawnFirework(20, 20, 20, p.getWorld(), Color.LIME, true, 100);
            }
        }

        return false;
    }
}
