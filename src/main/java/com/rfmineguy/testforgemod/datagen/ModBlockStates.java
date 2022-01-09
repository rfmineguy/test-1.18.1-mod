package com.rfmineguy.testforgemod.datagen;

import com.rfmineguy.testforgemod.TestForgeMod;
import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStates extends BlockStateProvider {
    public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TestForgeMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.TEST_ORE_OVERWORLD.get());
        simpleBlock(Registration.TEST_ORE_DEEPSLATE.get());
        simpleBlock(Registration.TEST_ORE_NETHER.get());
        simpleBlock(Registration.TEST_ORE_END.get());
    }
}
