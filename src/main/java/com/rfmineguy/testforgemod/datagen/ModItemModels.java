package com.rfmineguy.testforgemod.datagen;

import com.rfmineguy.testforgemod.TestForgeMod;
import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {
    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TestForgeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.TEST_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/test_ore_overworld"));
        withExistingParent(Registration.TEST_ORE_NETHER.get().getRegistryName().getPath(), modLoc("block/test_ore_nether"));
        withExistingParent(Registration.TEST_ORE_DEEPSLATE.get().getRegistryName().getPath(), modLoc("block/test_ore_deepslate"));
        withExistingParent(Registration.TEST_ORE_END.get().getRegistryName().getPath(), modLoc("block/test_ore_end"));
    }
}
