package SaturationFirepower.content;

import arc.Core;
import arc.func.Cons;
import arc.graphics.Blending;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.Rand;
import arc.math.geom.Vec2;
import arc.util.Eachable;
import arc.util.Time;
import arc.util.Tmp;
import arc.util.io.Reads;
import arc.util.io.Writes;
import mindustry.Vars;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.PointLaserBulletType;
import mindustry.entities.bullet.ShrapnelBulletType;
import mindustry.entities.part.HaloPart;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.*;
import mindustry.entities.units.BuildPlan;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.graphics.CacheLayer;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.logic.MessageBlock;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.SolidPump;
import mindustry.world.blocks.sandbox.ItemSource;
import mindustry.world.blocks.sandbox.LiquidSource;
import mindustry.world.blocks.sandbox.PowerVoid;
import mindustry.world.blocks.storage.StorageBlock;
import mindustry.world.consumers.ConsumeCoolant;
import mindustry.world.consumers.ConsumeLiquid;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class SFBlocks {
    public static Block
    //environment
    snowSand, 
    induFloor, induFloor_supplyer, induFloor_heater, induFloor_cover, induFloor_wall, induFloor_nano, 
    reforceFloor, reforceFloor2, reforceFloor3, 

    //ores + resupply point
    fermium, chromium, srontium, rare_earth,
    resupplyer_Cu, resupplyer_Pb, resupplyer_Ti, resupplyer_Th, resupplyer_sand, resupplyer_C,
    resupplyer_grap, resupplyer_Si, resupplyer_meta,  resupplyer_blas, resupplyer_plas,
    resupplyer_pyra, resupplyer_phas, resupplyer_surg, resupplyer_nano,

    //crafting
    sandFilter, sporeCompressor, flywheelCentrifuge,
    pyroSiSmleter, pyraBlender, blastBlender, explosiveBlender, slagFurnace, pressureGrinder, cryoCentrifuge, plasMultiCompresser, surgeThermalSmleter, surgeElectricSmlerer, 
    silisteelSmleter, siliconSmelterLarge, silisteelSmleterHuge, nanoConstructor, nanoPrinter, 
    energizer, discPhaseWaver, blastSiSmleter, nitrReactor, nitrPrecipitator, nanoActivator, 
    dissociator, tayriumCrucible, leippiumSmelter,

    primaryLab, seniorLab, warfareLab, 

    //wall
    silisteelWall, silisteelWallLarge, unfluxWall, unfluxWallLarge, discWall, discWallLarge, 
    fermWall, fermWallLarge, leipWall, leipWallLarge,
    discContainmentUnit, armorContainmentUnit, tayrContainmentUnit,
    
    //item_transport
    eleConveyor, complexArmorConveyor, silisteelConveyor, discItemCridge, discMassDriver, 


    //liquid
    tidalPump, silisteelConduit, complexArmorConduit, silisteelTank, discConduitBridge,
    armorOilTank,
    //power
    discEnergyCapacitor, armorEnergyCapacitor,
    heatGenerator, arcFissionReactor, fermReactor, hypermagneticReactor,
    //production
    pneumaticDrill, ionDrill, blastingDrillRig, eleWaterExtraactor, slagExtractor, oilFracker, sporeIncubator, quantumOreExtractor, 
    //storage
    mechanicalUnloader, hyperUnloader, molecularDatabase,

    //turrets

    //turrets_enemy_only


    //units

    //payloads

    //campaign

    //effect


}