package SaturationFirepower.content;

import arc.graphics.*;
import arc.struct.*;
import javafx.scene.paint.Color;
import mindustry.type.*;

public class SFItems {
    public static Item
    waterCan, slagCan, oilCan, cryoCan, nanoCan,
    silisteel, clusterExplosive, discordanceFabric, nanocore, fermium, chromium, tayriumAlloy, leippiumAlloy,
    primaryProt, seniorProt, hightestProt;
    public static void load(){
        waterCan = new Item("water-can", Color.valueOf("596ab8"));
    
        slagCan = new Item("slag-can", Color.valueOf("ffa166"));

        oilCan = new Item("oil-can", Color.valueOf("313131")){{
            flammability = 1.66;
        }};

        cryoCan = new Item("cryofluid-can", Color.valueOf("6ecdec"));

        nanoCan = new Item("nanofluid-can", Color.valueOf("7CF389"));

        silisteel = new Item("silisteel", Color.valueOf("7595D2")){{
            hardness = 0.3;
            cost = 1.75;
            healthScaling = 0.6;
            charge = 0.45;
        }};

        clusterExplosive = new Item("cluster-explosive", Color.valueOf("D85555")){{
            explosiveness = 3.8;
            flammability = 0.85;
        }};
        
        discordanceFabric = new Item("discordance-fabric", Color.valueOf("EEC591")){{
            cost = 6;
            healthScaling = 0.3;
            radioactivity = 2.5;
            explosiveness = 0.85;
            frames = 10;
            transitionFrames = 3;
            frameTime = 3;
        }};

        nanocore = new Item("nano-core", Color.valueOf("76D081")){{
            hardness = 9;
            cost = 0.75;
        }};

        fermium = new Item("fermium", Color.valueOf("DEDEDE")){{
            hardness = 7;
            cost = 4;
            healthScaling = 1.8;
            radioactivity = 1.5;
        }};

        chromium = new Item("chromium", Color.valueOf("666484")){{
            hardness = 9;
            cost = 12;
            healthScaling = 2;
        }};

        tayriumAlloy = new Item("tayrium-alloy", Color.valueOf("25C9AB")){{
            hardness = 9;
            cost = 8;
            healthScaling = 1.4;
            carge = 1.2;
        }};

        leippiumAlloy = new Item("leippium-alloy", Color.valueOf("5C5D79")){{
            hardness = 10;
            cost = 9;
            healthScaling = 3;
        }};

        primaryProt = new Item("primary-protocol", Color.valueOf("00EE00")){{
            cost = 0.5;
            frames = 6;
            transitionFrames = 1;
            frameTime = 3;
        }};

        seniorProt = new Item("senior-protocol", Color.valueOf("EEEE00")){{
            cost = 0.75;
            frames = 6;
            transitionFrames = 1;
            frameTime = 3;
        }};

        hightestProt = new Item("hightest-protocol", Color.valueOf("FF0000")){{
            cost = 1;
            frames = 6;
            transitionFrames = 1;
            frameTime = 3;
        }};
    }
}