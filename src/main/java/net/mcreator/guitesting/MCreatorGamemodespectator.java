package net.mcreator.guitesting;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementsguitesting.ModElement.Tag
public class MCreatorGamemodespectator extends Elementsguitesting.ModElement {
	public MCreatorGamemodespectator(Elementsguitesting instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGamemodespectator!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
	}
}
