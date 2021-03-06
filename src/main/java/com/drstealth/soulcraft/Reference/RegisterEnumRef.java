package com.drstealth.soulcraft.reference;

/**
 * Created by DrStealth on 8/20/2016.
 */
public class RegisterEnumRef
{
    public static enum SoulcraftItems
    {
        SOULMANUAL("soulManual", "ItemSoulManual"),
        SOULSHARD("soulShard", "ItemSoulShard");

        private String unlocalizedName;
        private String registryName;

        SoulcraftItems(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

        public String getRegistryName()
        {
            return registryName;
        }
    }

    public static enum SoulcraftBlocks
    {
        SOULGLASS("soulGlass", "BlockSoulGlass"),
        SOULTANK("soulTank", "BlockSoulTank"),
        SOULCOMPRESSOR("soulCompressor", "BlockSoulCompressor");

        private String unlocalizedName;
        private String registryName;

        SoulcraftBlocks(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

        public String getRegistryName()
        {
            return registryName;
        }
    }
}
