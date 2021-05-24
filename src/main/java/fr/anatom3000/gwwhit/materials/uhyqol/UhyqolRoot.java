package fr.anatom3000.gwwhit.materials.uhyqol;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
public class UhyqolRoot  {
public static final UhyqolIngot UHYQOL_INGOT = new UhyqolIngot();
public static final UhyqolBlock UHYQOL_BLOCK = new UhyqolBlock();
public static final UhyqolOre UHYQOL_ORE = new UhyqolOre();
public static final UhyqolSword UHYQOL_SWORD = new UhyqolSword(UhyqolMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","uhyqol_ingot"),UHYQOL_INGOT);
FuelRegistry.INSTANCE.add(UHYQOL_INGOT, 352);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "uhyqol_block"), UHYQOL_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "uhyqol_block"), new BlockItem(UHYQOL_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "uhyqol_ore"), UHYQOL_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "uhyqol_ore"), new BlockItem(UHYQOL_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","uhyqol_sword"),UHYQOL_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_uhyqol"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}