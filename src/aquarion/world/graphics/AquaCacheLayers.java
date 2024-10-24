package aquarion.world.graphics;

import mindustry.graphics.CacheLayer;

public class AquaCacheLayers {
    public static CacheLayer brine;

    public static void init() {
        CacheLayer.add(
                brine = new CacheLayer.ShaderLayer(AquaShaders.brine)
        );
    }
}