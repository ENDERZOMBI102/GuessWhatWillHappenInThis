package fr.anatom3000.gwwhit.materials.kuqoc;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class KuqocOre extends Block {
public KuqocOre() {super(FabricBlockSettings.of(Material.STONE).strength(4.70339961008607f,2.910770862862184f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));}

}