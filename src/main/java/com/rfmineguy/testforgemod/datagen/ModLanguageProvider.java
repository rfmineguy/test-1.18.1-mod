package com.rfmineguy.testforgemod.datagen;

import com.rfmineguy.testforgemod.TestForgeMod;
import com.rfmineguy.testforgemod.setup.ModSetup;
import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TestForgeMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + ModSetup.TAB_NAME, "TestForgeMod");

        add(Registration.TEST_ORE_OVERWORLD.get(), "Test Ore");
        add(Registration.TEST_ORE_NETHER.get(), "Test Ore");
        add(Registration.TEST_ORE_DEEPSLATE.get(), "Test Ore");
        add(Registration.TEST_ORE_END.get(), "Test Ore");
    }
}
