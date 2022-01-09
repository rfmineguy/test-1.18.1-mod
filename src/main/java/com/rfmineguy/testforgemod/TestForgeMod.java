package com.rfmineguy.testforgemod;

import com.rfmineguy.testforgemod.setup.ClientSetup;
import com.rfmineguy.testforgemod.setup.ModSetup;
import com.rfmineguy.testforgemod.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TestForgeMod.MOD_ID)
public class TestForgeMod {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "testforgemod";

    public TestForgeMod() {
        Registration.Init();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(ModSetup::Init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modBus.addListener(ClientSetup::Init));
    }
}
