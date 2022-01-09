package com.rfmineguy.testforgemod.datagen;

import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(DataGenerator p_126530_, BlockTagsProvider p_126531_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.TEST_ORE_OVERWORLD_ITEM.get())
                .add(Registration.TEST_ORE_NETHER_ITEM.get())
                .add(Registration.TEST_ORE_END_ITEM.get())
                .add(Registration.TEST_ORE_DEEPSLATE_ITEM.get());

    }

    @Override
    public String getName() {
        return "ModTags";
    }
}
