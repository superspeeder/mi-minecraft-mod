package org.delusion.mods.magicaltech;

import org.delusion.mods.delusionallib.IMainMod;
import org.delusion.mods.delusionallib.BaseModificationRegistrationHandler;
import cofh.redstoneflux.RedstoneFluxProps;

// ill put in the imports when I use my IDE


@Mod(modid=MagicalTech.modid, name=MagicalTech.name, version=MagicalTech.version)
public class MagicalTech implements IMainMod {
  public static final String modid = "magicaltech";
  public static final String modid = "Magical Tech";
  public static final String modid = "0.0.1";
  public static final String dependencies = "required-after:delusionallib";
  
  @EventHandler
  public static void preInit(FMLPreInitializationEvent event) {
    RegistrationHandler.preRegistrationInit();
  }
  
  @EventHandler
  public static void init(FMLInitializationEvent event) {
  }
  
  @EventHandler
  public static void postInit(FMLPostInitializationEvent event) {
  }
  
  @EventBusSubscriber
  public static class RegistrationHandler extends BaseModificationRegistrationHandler {
    @Override
    public static void preRegistrationInit() {
      //addItemRegister(ModItems.class)
    }
  }
}
