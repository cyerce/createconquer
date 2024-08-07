package net.aepherastudios.createconquer.block;

import net.aepherastudios.createconquer.CreateConquer;
import net.aepherastudios.createconquer.fluid.ModFluids;
import net.aepherastudios.createconquer.item.ModItems;
import net.aepherastudios.createconquer.CreateConquer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateConquer.MOD_ID);

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = registerBlock("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TANKSTEEL_BLOCK = registerBlock("tanksteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> GUNSTEEL_BLOCK = registerBlock("gunsteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_NIOBIUM_BLOCK = registerBlock("titanium_niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_235_BLOCK = registerBlock("uranium_235_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_238_BLOCK = registerBlock("uranium_238_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_233_BLOCK = registerBlock("uranium_233_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_6_BLOCK = registerBlock("lithium_6_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_7_BLOCK = registerBlock("lithium_7_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ROSESTEEL_BLOCK = registerBlock("rosesteel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> FISSILE_URANIUM_20_BLOCK = registerBlock("fissile_uranium_20_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> FISSILE_URANIUM_90_BLOCK = registerBlock("fissile_uranium_90_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BORAX_BLOCK = registerBlock("borax_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> BORON_BLOCK = registerBlock("boron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> POLONIUM_BLOCK = registerBlock("polonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STAINLESS_STEEL_BLOCK = registerBlock("stainless_steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> STABALLOY_BLOCK = registerBlock("staballoy_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> ALNICO_BLOCK = registerBlock("alnico_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> CHROMITE_ORE = registerBlock("chromite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COSALITE_ORE = registerBlock("cosalite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SPHALERITE_ORE = registerBlock("sphalerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MILLERITE_ORE = registerBlock("millerite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ILMENITE_ORE = registerBlock("ilmenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEPIDOLITE_ORE = registerBlock("lepidolite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOBERYL_ORE = registerBlock("chrysoberyl_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WOLFRAMITE_ORE = registerBlock("wolframite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BORAX_ORE = registerBlock("borax_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GALENA_ORE = registerBlock("galena_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANINITE_ORE = registerBlock("uraninite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COLUMBITE_ORE = registerBlock("columbite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGNETITE_ORE = registerBlock("magnetite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_ORE = registerBlock("corundum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALUNITE_ORE = registerBlock("alunite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PENTLANDITE_ORE = registerBlock("pentlandite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE)));


    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_URANIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLUTONIUM_BLOCK = BLOCKS.register("molten_plutonium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_PLUTONIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BERYLLIUM_BLOCK = BLOCKS.register("molten_beryllium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BERYLLIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_BLOCK = BLOCKS.register("molten_titanium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TITANIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_BLOCK = BLOCKS.register("molten_lithium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LITHIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_THORIUM_BLOCK = BLOCKS.register("molten_thorium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_THORIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NIOBIUM_BLOCK = BLOCKS.register("molten_niobium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NIOBIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_STEEL_BLOCK = BLOCKS.register("molten_steel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GUNSTEEL_BLOCK = BLOCKS.register("molten_gunsteel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GUNSTEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TANKSTEEL_BLOCK = BLOCKS.register("molten_tanksteel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TANKSTEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TITANIUM_NIOBIUM_BLOCK = BLOCKS.register("molten_titanium_niobium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TITANIUM_NIOBIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINUM_BLOCK = BLOCKS.register("molten_aluminum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ALUMINUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TIN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = BLOCKS.register("molten_zinc_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILICON_BLOCK = BLOCKS.register("molten_silicon_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_SILICON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_235_BLOCK = BLOCKS.register("molten_uranium_235_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_URANIUM_235, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_238_BLOCK = BLOCKS.register("molten_uranium_238_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_URANIUM_238, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_233_BLOCK = BLOCKS.register("molten_uranium_233_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_URANIUM_233, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_FISSILE_URANIUM_20_BLOCK = BLOCKS.register("molten_fissile_uranium_20_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_FISSILE_URANIUM_20, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_FISSILE_URANIUM_90_BLOCK = BLOCKS.register("molten_fissile_uranium_90_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_FISSILE_URANIUM_90, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_6_BLOCK = BLOCKS.register("molten_lithium_6_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LITHIUM_6, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_7_BLOCK = BLOCKS.register("molten_lithium_7_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_LITHIUM_7, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ROSE_GOLD_BLOCK = BLOCKS.register("molten_rose_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ROSE_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ROSESTEEL_BLOCK = BLOCKS.register("molten_rosesteel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ROSESTEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_INVAR_BLOCK = BLOCKS.register("molten_invar_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_INVAR, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRONZE_BLOCK = BLOCKS.register("molten_bronze_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRONZE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALNICO_BLOCK = BLOCKS.register("molten_alnico_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ALNICO, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_STAINLESS_STEEL_BLOCK = BLOCKS.register("molten_stainless_steel_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_STAINLESS_STEEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_STABALLOY_BLOCK = BLOCKS.register("molten_staballoy_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_STABALLOY, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = BLOCKS.register("molten_brass_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BRASS, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BISMUTH_BLOCK = BLOCKS.register("molten_bismuth_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_BISMUTH, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_POLONIUM_BLOCK = BLOCKS.register("molten_polonium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_POLONIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TUNGSTEN_BLOCK = BLOCKS.register("molten_tungsten_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_TUNGSTEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CHROMIUM_BLOCK = BLOCKS.register("molten_chromium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_CHROMIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COBALT_BLOCK = BLOCKS.register("molten_cobalt_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COBALT, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ELECTRUM_BLOCK = BLOCKS.register("molten_electrum_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_ELECTRUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = BLOCKS.register("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> MOLTEN_REDSTONE_BLOCK = BLOCKS.register("molten_redstone_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_REDSTONE, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> OXYGEN_BLOCK = BLOCKS.register("oxygen_block",
            () -> new LiquidBlock(ModFluids.SOURCE_OXYGEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HYDROGEN_BLOCK = BLOCKS.register("hydrogen_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HYDROGEN, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> HEAVY_WATER_BLOCK = BLOCKS.register("heavy_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HEAVY_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> DEUTERIUM_BLOCK = BLOCKS.register("deuterium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_DEUTERIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> TRITIUM_BLOCK = BLOCKS.register("tritium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_TRITIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<LiquidBlock> CRUDE_OIL_BLOCK = BLOCKS.register("crude_oil_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CRUDE_OIL, BlockBehaviour.Properties.copy(Blocks.LAVA)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}