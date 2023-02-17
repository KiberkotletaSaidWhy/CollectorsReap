package net.brdle.collectorsreap.common.block;

import net.brdle.collectorsreap.CollectorsReap;
import net.brdle.collectorsreap.common.item.CRItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class CRBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CollectorsReap.MODID);

    public static final RegistryObject<Block> PORTOBELLO = registerBlock("portobello",
        () -> new PortobelloBlock(copy(Blocks.BROWN_MUSHROOM)
            .noCollission().randomTicks().instabreak().sound(SoundType.GRASS).lightLevel((l) -> 1).hasPostProcess(CRBlocks::always)));
    public static final RegistryObject<Block> PORTOBELLO_COLONY = registerBlock("portobello_colony",
        () -> new PortobelloColonyBlock(copy(ModBlocks.BROWN_MUSHROOM_COLONY), CRItems.PORTOBELLO));
    public static final RegistryObject<Block> PORTOBELLO_QUICHE = registerBlock("portobello_quiche",
        () -> new PieBlock(copy(ModBlocks.APPLE_PIE), CRItems.PORTOBELLO_QUICHE_SLICE));
    public static final RegistryObject<Block> LIME_PIE = registerBlock("lime_pie",
        () -> new PieBlock(copy(ModBlocks.APPLE_PIE), CRItems.LIME_PIE_SLICE));

    public static final RegistryObject<Block> LIME_CAKE = registerBlock("lime_cake", () -> new EffectCakeBlock(copy(Blocks.CAKE), CRItems.LIME_CAKE_SLICE));
    public static final RegistryObject<Block> CANDLE_LIME_CAKE = registerBlock("candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.CANDLE, copy(Blocks.CAKE).lightLevel(litBlockEmission(3))));
    public static final RegistryObject<Block> WHITE_CANDLE_LIME_CAKE = registerBlock("white_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.WHITE_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> ORANGE_CANDLE_LIME_CAKE = registerBlock("orange_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.ORANGE_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> MAGENTA_CANDLE_LIME_CAKE = registerBlock("magenta_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.MAGENTA_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE_LIME_CAKE = registerBlock("light_blue_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.LIGHT_BLUE_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> YELLOW_CANDLE_LIME_CAKE = registerBlock("yellow_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.YELLOW_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> LIME_CANDLE_LIME_CAKE = registerBlock("lime_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.LIME_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> PINK_CANDLE_LIME_CAKE = registerBlock("pink_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.PINK_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> GRAY_CANDLE_LIME_CAKE = registerBlock("gray_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.GRAY_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE_LIME_CAKE = registerBlock("light_gray_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.LIGHT_GRAY_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> CYAN_CANDLE_LIME_CAKE = registerBlock("cyan_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.CYAN_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> PURPLE_CANDLE_LIME_CAKE = registerBlock("purple_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.PURPLE_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> BLUE_CANDLE_LIME_CAKE = registerBlock("blue_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.BLUE_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> BROWN_CANDLE_LIME_CAKE = registerBlock("brown_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.BROWN_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> GREEN_CANDLE_LIME_CAKE = registerBlock("green_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.GREEN_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> RED_CANDLE_LIME_CAKE = registerBlock("red_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.RED_CANDLE, copy(CANDLE_LIME_CAKE.get())));
    public static final RegistryObject<Block> BLACK_CANDLE_LIME_CAKE = registerBlock("black_candle_lime_cake", () -> new EffectCandleCakeBlock(CRBlocks.LIME_CAKE.get(), Blocks.BLACK_CANDLE, copy(CANDLE_LIME_CAKE.get())));

    public static final RegistryObject<Block> POMEGRANATE_CAKE = registerBlock("pomegranate_cake", () -> new EffectCakeBlock(copy(Blocks.CAKE), CRItems.POMEGRANATE_CAKE_SLICE));
    public static final RegistryObject<Block> CANDLE_POMEGRANATE_CAKE = registerBlock("candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.CANDLE, copy(Blocks.CAKE).lightLevel(litBlockEmission(3))));
    public static final RegistryObject<Block> WHITE_CANDLE_POMEGRANATE_CAKE = registerBlock("white_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.WHITE_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> ORANGE_CANDLE_POMEGRANATE_CAKE = registerBlock("orange_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.ORANGE_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> MAGENTA_CANDLE_POMEGRANATE_CAKE = registerBlock("magenta_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.MAGENTA_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE_POMEGRANATE_CAKE = registerBlock("light_blue_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.LIGHT_BLUE_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> YELLOW_CANDLE_POMEGRANATE_CAKE = registerBlock("yellow_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.YELLOW_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> LIME_CANDLE_POMEGRANATE_CAKE = registerBlock("lime_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.LIME_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> PINK_CANDLE_POMEGRANATE_CAKE = registerBlock("pink_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.PINK_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> GRAY_CANDLE_POMEGRANATE_CAKE = registerBlock("gray_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.GRAY_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE_POMEGRANATE_CAKE = registerBlock("light_gray_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.LIGHT_GRAY_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> CYAN_CANDLE_POMEGRANATE_CAKE = registerBlock("cyan_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.CYAN_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> PURPLE_CANDLE_POMEGRANATE_CAKE = registerBlock("purple_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.PURPLE_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> BLUE_CANDLE_POMEGRANATE_CAKE = registerBlock("blue_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.BLUE_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> BROWN_CANDLE_POMEGRANATE_CAKE = registerBlock("brown_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.BROWN_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> GREEN_CANDLE_POMEGRANATE_CAKE = registerBlock("green_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.GREEN_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> RED_CANDLE_POMEGRANATE_CAKE = registerBlock("red_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.RED_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));
    public static final RegistryObject<Block> BLACK_CANDLE_POMEGRANATE_CAKE = registerBlock("black_candle_pomegranate_cake", () -> new EffectCandleCakeBlock(CRBlocks.POMEGRANATE_CAKE.get(), Blocks.BLACK_CANDLE, copy(CANDLE_POMEGRANATE_CAKE.get())));

    public static final RegistryObject<Block> LIME_BUSH = registerBlock("lime_bush",
        () -> new LimeBushBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SMALL_LIME_BUSH = registerBlock("small_lime_bush",
        () -> new SmallLimeBushBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SMALL_POMEGRANATE_BUSH = registerBlock("small_pomegranate_bush",
        () -> new SmallPomegranateBushBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> POMEGRANATE_BUSH = registerBlock("pomegranate_bush",
        () -> new PomegranateBushBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> LIME_CRATE = BLOCKS.register("lime_crate",
        () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> POMEGRANATE_CRATE = BLOCKS.register("pomegranate_crate",
        () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ICE_CREAM_BLOCK = BLOCKS.register("lime_ice_cream_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.COLOR_LIGHT_GREEN).strength(0.2F).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> POMEGRANATE_ICE_CREAM_BLOCK = BLOCKS.register("pomegranate_ice_cream_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.COLOR_RED).strength(0.2F).sound(SoundType.SNOW)));

    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }

    public static void create(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static BlockBehaviour.Properties copy(Supplier<Block> block) {
        return copy(block.get());
    }

    private static BlockBehaviour.Properties copy(Block block) {
        return BlockBehaviour.Properties.copy(block);
    }

    private static boolean always(BlockState a, BlockGetter b, BlockPos c) {
        return true;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
    }
}