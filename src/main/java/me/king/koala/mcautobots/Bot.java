package me.king.koala.mcautobots;

import org.bukkit.Material;

import java.util.List;

public class Bot {

    int dimensionX;
    int dimensionY;
    int dimensionZ;

    LayerDirection layerDirection;

    List<Material> ignoredBlocks;
    List<Material> stoppingBlocks;

    Material helmet;
    Material chestplate;
    Material leggings;
    Material boots;

    Material tool;

    int maximumChests;

}
