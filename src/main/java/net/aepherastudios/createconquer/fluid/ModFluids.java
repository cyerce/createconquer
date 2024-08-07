package net.aepherastudios.createconquer.fluid;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.block.ModBlocks;
import net.aepherastudios.createconquer.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateConquer.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM = FLUIDS.register("molten_uranium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLUTONIUM = FLUIDS.register("molten_plutonium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLUTONIUM = FLUIDS.register("flowing_molten_plutonium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_PLUTONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM = FLUIDS.register("molten_titanium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM = FLUIDS.register("flowing_molten_titanium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TITANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BERYLLIUM = FLUIDS.register("molten_beryllium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BERYLLIUM = FLUIDS.register("flowing_molten_beryllium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BERYLLIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM = FLUIDS.register("molten_lithium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM = FLUIDS.register("flowing_molten_lithium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_THORIUM = FLUIDS.register("molten_thorium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_THORIUM = FLUIDS.register("flowing_molten_thorium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_THORIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LEAD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NIOBIUM = FLUIDS.register("molten_niobium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NIOBIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NIOBIUM = FLUIDS.register("flowing_molten_niobium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NIOBIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TANKSTEEL = FLUIDS.register("molten_tanksteel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TANKSTEEL = FLUIDS.register("flowing_molten_tanksteel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TANKSTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STEEL = FLUIDS.register("molten_steel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STEEL = FLUIDS.register("flowing_molten_steel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GUNSTEEL = FLUIDS.register("molten_gunsteel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GUNSTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GUNSTEEL = FLUIDS.register("flowing_molten_gunsteel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GUNSTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TITANIUM_NIOBIUM = FLUIDS.register("molten_titanium_niobium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TITANIUM_NIOBIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TITANIUM_NIOBIUM = FLUIDS.register("flowing_molten_titanium_niobium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TITANIUM_NIOBIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM = FLUIDS.register("molten_aluminum_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM = FLUIDS.register("flowing_molten_aluminum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ALUMINUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TIN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ZINC_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ZINC_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILICON = FLUIDS.register("molten_silicon_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILICON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILICON = FLUIDS.register("flowing_molten_silicon",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILICON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_235 = FLUIDS.register("molten_uranium_235_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_235 = FLUIDS.register("flowing_molten_uranium_235",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_235_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_238 = FLUIDS.register("molten_uranium_238_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_238 = FLUIDS.register("flowing_molten_uranium_238",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_238_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM_233 = FLUIDS.register("molten_uranium_233_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM_233 = FLUIDS.register("flowing_molten_uranium_233",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_233_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("molten_fissile_uranium_20_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_20 = FLUIDS.register("flowing_molten_fissile_uranium_20",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("molten_fissile_uranium_90_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FISSILE_URANIUM_90 = FLUIDS.register("flowing_molten_fissile_uranium_90",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_6 = FLUIDS.register("molten_lithium_6_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_6 = FLUIDS.register("flowing_molten_lithium_6",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_6_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LITHIUM_7 = FLUIDS.register("molten_lithium_7_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LITHIUM_7 = FLUIDS.register("flowing_molten_lithium_7",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LITHIUM_7_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSE_GOLD = FLUIDS.register("molten_rose_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSE_GOLD = FLUIDS.register("flowing_molten_rose_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ROSE_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ROSESTEEL = FLUIDS.register("molten_rosesteel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ROSESTEEL = FLUIDS.register("flowing_molten_rosesteel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ROSESTEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALNICO = FLUIDS.register("molten_alnico_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALNICO = FLUIDS.register("flowing_molten_alnico",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ALNICO_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRONZE = FLUIDS.register("molten_bronze_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRONZE = FLUIDS.register("flowing_molten_bronze",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_INVAR = FLUIDS.register("molten_invar_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_INVAR_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_INVAR = FLUIDS.register("flowing_molten_invar",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_INVAR_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STAINLESS_STEEL = FLUIDS.register("molten_stainless_steel_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STAINLESS_STEEL = FLUIDS.register("flowing_molten_stainless_steel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_STABALLOY = FLUIDS.register("molten_staballoy_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STABALLOY = FLUIDS.register("flowing_molten_staballoy",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_STABALLOY_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BRASS = FLUIDS.register("molten_brass_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BRASS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BRASS = FLUIDS.register("flowing_molten_brass",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BRASS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_BISMUTH = FLUIDS.register("molten_bismuth_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_BISMUTH = FLUIDS.register("flowing_molten_bismuth",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_BISMUTH_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_POLONIUM = FLUIDS.register("molten_polonium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_POLONIUM = FLUIDS.register("flowing_molten_polonium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_POLONIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TUNGSTEN = FLUIDS.register("molten_tungsten_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TUNGSTEN = FLUIDS.register("flowing_molten_tungsten",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TUNGSTEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHROMIUM = FLUIDS.register("molten_chromium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHROMIUM = FLUIDS.register("flowing_molten_chromium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CHROMIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COBALT = FLUIDS.register("molten_cobalt_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COBALT_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COBALT = FLUIDS.register("flowing_molten_cobalt",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COBALT_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ELECTRUM = FLUIDS.register("molten_electrum_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ELECTRUM = FLUIDS.register("flowing_molten_electrum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILVER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_REDSTONE = FLUIDS.register("molten_redstone_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_REDSTONE = FLUIDS.register("flowing_molten_redstone",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_OXYGEN = FLUIDS.register("oxygen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.OXYGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_OXYGEN = FLUIDS.register("flowing_oxygen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.OXYGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HYDROGEN = FLUIDS.register("hydrogen_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HYDROGEN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN = FLUIDS.register("flowing_hydrogen",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HYDROGEN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_HEAVY_WATER = FLUIDS.register("heavy_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HEAVY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HEAVY_WATER = FLUIDS.register("flowing_heavy_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HEAVY_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_DEUTERIUM = FLUIDS.register("deuterium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DEUTERIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEUTERIUM = FLUIDS.register("flowing_deuterium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DEUTERIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_TRITIUM = FLUIDS.register("tritium_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.TRITIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_TRITIUM = FLUIDS.register("flowing_tritium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.TRITIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CRUDE_OIL_FLUID_PROPERTIES));



    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            UraniumFluidType.MOLTEN_URANIUM_FLUID_TYPE, SOURCE_MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_URANIUM_BLOCK).bucket(ModItems.MOLTEN_URANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLUTONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PlutoniumFluidType.MOLTEN_PLUTONIUM_FLUID_TYPE, SOURCE_MOLTEN_PLUTONIUM, FLOWING_MOLTEN_PLUTONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_PLUTONIUM_BLOCK).bucket(ModItems.MOLTEN_PLUTONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BERYLLIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BerylliumFluidType.MOLTEN_BERYLLIUM_FLUID_TYPE, SOURCE_MOLTEN_BERYLLIUM, FLOWING_MOLTEN_BERYLLIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_BERYLLIUM_BLOCK).bucket(ModItems.MOLTEN_BERYLLIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumFluidType.MOLTEN_TITANIUM_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM, FLOWING_MOLTEN_TITANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TITANIUM_BLOCK).bucket(ModItems.MOLTEN_TITANIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LithiumFluidType.MOLTEN_LITHIUM_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM, FLOWING_MOLTEN_LITHIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LITHIUM_BLOCK).bucket(ModItems.MOLTEN_LITHIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_THORIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ThoriumFluidType.MOLTEN_THORIUM_FLUID_TYPE, SOURCE_MOLTEN_THORIUM, FLOWING_MOLTEN_THORIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_THORIUM_BLOCK).bucket(ModItems.MOLTEN_THORIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NIOBIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NiobiumFluidType.MOLTEN_NIOBIUM_FLUID_TYPE, SOURCE_MOLTEN_NIOBIUM, FLOWING_MOLTEN_NIOBIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_NIOBIUM_BLOCK).bucket(ModItems.MOLTEN_NIOBIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NickelFluidType.MOLTEN_NICKEL_FLUID_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_NICKEL_BLOCK).bucket(ModItems.MOLTEN_NICKEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            LeadFluidType.MOLTEN_LEAD_FLUID_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LEAD_BLOCK).bucket(ModItems.MOLTEN_LEAD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TANKSTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TanksteelFluidType.MOLTEN_TANKSTEEL_FLUID_TYPE, SOURCE_MOLTEN_TANKSTEEL, FLOWING_MOLTEN_TANKSTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TANKSTEEL_BLOCK).bucket(ModItems.MOLTEN_TANKSTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GUNSTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GunsteelFluidType.MOLTEN_GUNSTEEL_FLUID_TYPE, SOURCE_MOLTEN_GUNSTEEL, FLOWING_MOLTEN_GUNSTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GUNSTEEL_BLOCK).bucket(ModItems.MOLTEN_GUNSTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SteelFluidType.MOLTEN_STEEL_FLUID_TYPE, SOURCE_MOLTEN_STEEL, FLOWING_MOLTEN_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_STEEL_BLOCK).bucket(ModItems.MOLTEN_STEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TITANIUM_NIOBIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TitaniumNiobiumFluidType.MOLTEN_TITANIUM_NIOBIUM_FLUID_TYPE, SOURCE_MOLTEN_TITANIUM_NIOBIUM, FLOWING_MOLTEN_TITANIUM_NIOBIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TITANIUM_NIOBIUM_BLOCK).bucket(ModItems.MOLTEN_TITANIUM_NIOBIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AluminumFluidType.MOLTEN_ALUMINUM_FLUID_TYPE, SOURCE_MOLTEN_ALUMINUM, FLOWING_MOLTEN_ALUMINUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ALUMINUM_BLOCK).bucket(ModItems.MOLTEN_ALUMINUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TinFluidType.MOLTEN_TIN_FLUID_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TIN_BLOCK).bucket(ModItems.MOLTEN_TIN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ZincFluidType.MOLTEN_ZINC_FLUID_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ZINC_BLOCK).bucket(ModItems.MOLTEN_ZINC_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CopperFluidType.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_COPPER_BLOCK).bucket(ModItems.MOLTEN_COPPER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILICON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SiliconFluidType.MOLTEN_SILICON_FLUID_TYPE, SOURCE_MOLTEN_SILICON, FLOWING_MOLTEN_SILICON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_SILICON_BLOCK).bucket(ModItems.MOLTEN_SILICON_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_235_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium235FluidType.MOLTEN_URANIUM_235_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_235, FLOWING_MOLTEN_URANIUM_235)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_URANIUM_235_BLOCK).bucket(ModItems.MOLTEN_URANIUM_235_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_238_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium238FluidType.MOLTEN_URANIUM_238_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_238, FLOWING_MOLTEN_URANIUM_238)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_URANIUM_238_BLOCK).bucket(ModItems.MOLTEN_URANIUM_238_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_233_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Uranium233FluidType.MOLTEN_URANIUM_233_FLUID_TYPE, SOURCE_MOLTEN_URANIUM_233, FLOWING_MOLTEN_URANIUM_233)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_URANIUM_233_BLOCK).bucket(ModItems.MOLTEN_URANIUM_233_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_FISSILE_URANIUM_20_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FissileUranium20FluidType.MOLTEN_FISSILE_URANIUM_20_FLUID_TYPE, SOURCE_MOLTEN_FISSILE_URANIUM_20, FLOWING_MOLTEN_FISSILE_URANIUM_20)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_FISSILE_URANIUM_20_BLOCK).bucket(ModItems.MOLTEN_FISSILE_URANIUM_20_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_FISSILE_URANIUM_90_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            FissileUranium90FluidType.MOLTEN_FISSILE_URANIUM_90_FLUID_TYPE, SOURCE_MOLTEN_FISSILE_URANIUM_90, FLOWING_MOLTEN_FISSILE_URANIUM_90)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_FISSILE_URANIUM_90_BLOCK).bucket(ModItems.MOLTEN_FISSILE_URANIUM_90_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_6_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Lithium6FluidType.MOLTEN_LITHIUM_6_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_6, FLOWING_MOLTEN_LITHIUM_6)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LITHIUM_6_BLOCK).bucket(ModItems.MOLTEN_LITHIUM_6_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_7_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            Lithium7FluidType.MOLTEN_LITHIUM_7_FLUID_TYPE, SOURCE_MOLTEN_LITHIUM_7, FLOWING_MOLTEN_LITHIUM_7)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LITHIUM_7_BLOCK).bucket(ModItems.MOLTEN_LITHIUM_7_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ROSE_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RoseGoldFluidType.MOLTEN_ROSE_GOLD_FLUID_TYPE, SOURCE_MOLTEN_ROSE_GOLD, FLOWING_MOLTEN_ROSE_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ROSE_GOLD_BLOCK).bucket(ModItems.MOLTEN_ROSE_GOLD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ROSESTEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RosesteelFluidType.MOLTEN_ROSESTEEL_FLUID_TYPE, SOURCE_MOLTEN_ROSESTEEL, FLOWING_MOLTEN_ROSESTEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ROSESTEEL_BLOCK).bucket(ModItems.MOLTEN_ROSESTEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_INVAR_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            InvarFluidType.MOLTEN_INVAR_FLUID_TYPE, SOURCE_MOLTEN_INVAR, FLOWING_MOLTEN_INVAR)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_INVAR_BLOCK).bucket(ModItems.MOLTEN_INVAR_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BronzeFluidType.MOLTEN_BRONZE_FLUID_TYPE, SOURCE_MOLTEN_BRONZE, FLOWING_MOLTEN_BRONZE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_BRONZE_BLOCK).bucket(ModItems.MOLTEN_BRONZE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALNICO_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            AlnicoFluidType.MOLTEN_ALNICO_FLUID_TYPE, SOURCE_MOLTEN_ALNICO, FLOWING_MOLTEN_ALNICO)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ALNICO_BLOCK).bucket(ModItems.MOLTEN_ALNICO_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STAINLESS_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            StainlessSteelFluidType.MOLTEN_STAINLESS_STEEL_FLUID_TYPE, SOURCE_MOLTEN_STAINLESS_STEEL, FLOWING_MOLTEN_STAINLESS_STEEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_STAINLESS_STEEL_BLOCK).bucket(ModItems.MOLTEN_STAINLESS_STEEL_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_STABALLOY_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            StaballoyFluidType.MOLTEN_STABALLOY_FLUID_TYPE, SOURCE_MOLTEN_STABALLOY, FLOWING_MOLTEN_STABALLOY)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_STABALLOY_BLOCK).bucket(ModItems.MOLTEN_STABALLOY_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BrassFluidType.MOLTEN_BRASS_FLUID_TYPE, SOURCE_MOLTEN_BRASS, FLOWING_MOLTEN_BRASS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_BRASS_BLOCK).bucket(ModItems.MOLTEN_BRASS_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_BISMUTH_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            BismuthFluidType.MOLTEN_BISMUTH_FLUID_TYPE, SOURCE_MOLTEN_BISMUTH, FLOWING_MOLTEN_BISMUTH)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_BISMUTH_BLOCK).bucket(ModItems.MOLTEN_BISMUTH_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_POLONIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PoloniumFluidType.MOLTEN_POLONIUM_FLUID_TYPE, SOURCE_MOLTEN_POLONIUM, FLOWING_MOLTEN_POLONIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_POLONIUM_BLOCK).bucket(ModItems.MOLTEN_POLONIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_TUNGSTEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TungstenFluidType.MOLTEN_TUNGSTEN_FLUID_TYPE, SOURCE_MOLTEN_TUNGSTEN, FLOWING_MOLTEN_TUNGSTEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TUNGSTEN_BLOCK).bucket(ModItems.MOLTEN_TUNGSTEN_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_CHROMIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ChromiumFluidType.MOLTEN_CHROMIUM_FLUID_TYPE, SOURCE_MOLTEN_CHROMIUM, FLOWING_MOLTEN_CHROMIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_CHROMIUM_BLOCK).bucket(ModItems.MOLTEN_CHROMIUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_COBALT_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CobaltFluidType.MOLTEN_COBALT_FLUID_TYPE, SOURCE_MOLTEN_COBALT, FLOWING_MOLTEN_COBALT)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_COBALT_BLOCK).bucket(ModItems.MOLTEN_COBALT_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ElectrumFluidType.MOLTEN_ELECTRUM_FLUID_TYPE, SOURCE_MOLTEN_ELECTRUM, FLOWING_MOLTEN_ELECTRUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ELECTRUM_BLOCK).bucket(ModItems.MOLTEN_ELECTRUM_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            SilverFluidType.MOLTEN_SILVER_FLUID_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_SILVER_BLOCK).bucket(ModItems.MOLTEN_SILVER_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            IronFluidType.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRON_BLOCK).bucket(ModItems.MOLTEN_IRON_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            GoldFluidType.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GOLD_BLOCK).bucket(ModItems.MOLTEN_GOLD_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_NETHERITE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            NetheriteFluidType.MOLTEN_NETHERITE_FLUID_TYPE, SOURCE_MOLTEN_NETHERITE, FLOWING_MOLTEN_NETHERITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_NETHERITE_BLOCK).bucket(ModItems.MOLTEN_NETHERITE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties MOLTEN_REDSTONE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            RedstoneFluidType.MOLTEN_REDSTONE_FLUID_TYPE, SOURCE_MOLTEN_REDSTONE, FLOWING_MOLTEN_REDSTONE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_REDSTONE_BLOCK).bucket(ModItems.MOLTEN_REDSTONE_BUCKET).tickRate(30);

    public static final ForgeFlowingFluid.Properties OXYGEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            OxygenFluidType.OXYGEN_FLUID_TYPE, SOURCE_OXYGEN, FLOWING_OXYGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.OXYGEN_BLOCK).bucket(ModItems.OXYGEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HYDROGEN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HydrogenFluidType.HYDROGEN_FLUID_TYPE, SOURCE_HYDROGEN, FLOWING_HYDROGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.HYDROGEN_BLOCK).bucket(ModItems.HYDROGEN_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties HEAVY_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HeavyWaterFluidType.HEAVY_WATER_FLUID_TYPE, SOURCE_HEAVY_WATER, FLOWING_HEAVY_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.HEAVY_WATER_BLOCK).bucket(ModItems.HEAVY_WATER_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties DEUTERIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            DeuteriumFluidType.DEUTERIUM_FLUID_TYPE, SOURCE_DEUTERIUM, FLOWING_DEUTERIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.DEUTERIUM_BLOCK).bucket(ModItems.DEUTERIUM_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties TRITIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            TritiumFluidType.TRITIUM_FLUID_TYPE, SOURCE_TRITIUM, FLOWING_TRITIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.TRITIUM_BLOCK).bucket(ModItems.TRITIUM_BUCKET).tickRate(5);

    public static final ForgeFlowingFluid.Properties CRUDE_OIL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            CrudeOilFluidType.CRUDE_OIL_FLUID_TYPE, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.CRUDE_OIL_BLOCK).bucket(ModItems.CRUDE_OIL_BUCKET).tickRate(5);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
