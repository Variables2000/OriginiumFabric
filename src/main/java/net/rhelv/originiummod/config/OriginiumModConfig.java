package net.rhelv.originiummod.config;

import net.rhelv.originiummod.common.config.Config;

public class OriginiumModConfig {
    @Config(config = "misc", category = "originiumtnt", key = "fusetime", comment = "Fuse time for Originium Bomb")
    public static int fuseTime = 120;
    @Config(config = "misc", category = "originiumtnt", key = "radius", comment = "Nuke explosion radius")
    public static int nukeRadius = 12;
}
