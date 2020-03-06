package net.mcreator.guitesting;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementsguitesting.ModElement.Tag
public class MCreatorGamemodecreative extends Elementsguitesting.ModElement {
	public MCreatorGamemodecreative(Elementsguitesting instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGamemodecreative!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.CREATIVE);
	}
}
