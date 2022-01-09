package com.rfmineguy.testforgemod.setup;

import com.rfmineguy.testforgemod.TestForgeMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestForgeMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestForgeMod.MOD_ID);

    public static void Init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(BLOCKS);
        bus.register(ITEMS);

        TestForgeMod.LOGGER.info("Registered blocks and items.");
    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static RegistryObject<Block> TEST_ORE_OVERWORLD = BLOCKS.register("test_ore_overworld", () -> new Block(ORE_PROPERTIES));
    public static RegistryObject<Item> TEST_ORE_OVERWORLD_ITEM = fromBlock(TEST_ORE_OVERWORLD);

    public static RegistryObject<Block> TEST_ORE_NETHER = BLOCKS.register("test_ore_nether", () -> new Block(ORE_PROPERTIES));
    public static RegistryObject<Item> TEST_ORE_NETHER_ITEM = fromBlock(TEST_ORE_NETHER);

    public static RegistryObject<Block> TEST_ORE_END = BLOCKS.register("test_ore_end", () -> new Block(ORE_PROPERTIES));
    public static RegistryObject<Item> TEST_ORE_END_ITEM = fromBlock(TEST_ORE_END);

    public static RegistryObject<Block> TEST_ORE_DEEPSLATE = BLOCKS.register("test_ore_deepslate", () -> new Block(ORE_PROPERTIES));
    public static RegistryObject<Item> TEST_ORE_DEEPSLATE_ITEM = fromBlock(TEST_ORE_DEEPSLATE);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), ()->new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
