package SaturationFirepower.content;

import arc.graphics.*;
import mindustry.type.*;

import static mindustry.content.Liquids.*;

public class SFLiquid {
    public static Liquid nanofluid, nitratedOil, actiNanofluid;

    public static void load(){

        nanofluid = new Liquid("nanofluid", Color.valueOf("7CF389")){{
            heatCapacity = 1.45f;
            temperature = 0.3f;
            viscosity = 0.3f;
            //effect = SFStatuesEffects.ele;
            lightColor = Color.valueOf("7CF389").a(0.3f);
        }};

        nitratedOil =  new Liquid("nitrated-oil", Color.valueOf("333333")){{
            temperature = 0.5f;
            viscosity = 0.8f;
            flammability = 1.5f;
            explosiveness = 3.2f;
        }};

        actiNanofluid = new Liquid("actived-nanofluid", Color.valueOf("7FD489")){{
            moveThroughBlocks = true;
            blockReactive = true;
            capPuddles = true;
            canStayOn.addAll(water, oil, cryofluid, slag);
            spreadTarget = nanofluid;
            

        }};
    }
}
