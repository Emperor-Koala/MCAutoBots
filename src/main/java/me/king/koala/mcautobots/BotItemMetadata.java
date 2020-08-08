package me.king.koala.mcautobots;

import org.bukkit.block.Chest;

import java.util.ArrayList;

public class BotItemMetadata {

    Bot bot;

    ArrayList<Chest> chests;

    public BotItemMetadata(Bot bot) {
        this.bot = bot;
        this.chests = new ArrayList<>();
    }

}
