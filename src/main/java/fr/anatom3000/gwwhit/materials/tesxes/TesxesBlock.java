package fr.anatom3000.gwwhit.materials.tesxes;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class TesxesBlock extends Block {
public TesxesBlock() {super(FabricBlockSettings.of(Material.METAL).strength(2.091801783598851f,1.7926571357386263f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));}

}