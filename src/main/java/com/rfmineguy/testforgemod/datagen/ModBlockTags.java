package com.rfmineguy.testforgemod.datagen;

import com.rfmineguy.testforgemod.TestForgeMod;
import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider {
    public ModBlockTags(DataGenerator p_126511_, ExistingFileHelper existingFileHelper) {
        super(p_126511_, TestForgeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get())
                .add(Registration.TEST_ORE_OVERWORLD.get());
    }

    @Override
    public String getName() {
        return "ModTags";
    }
}
