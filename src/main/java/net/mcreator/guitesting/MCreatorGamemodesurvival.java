package net.mcreator.guitesting;

import net.minecraft.world.GameType;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementsguitesting.ModElement.Tag
public class MCreatorGamemodesurvival extends Elementsguitesting.ModElement {
	public MCreatorGamemodesurvival(Elementsguitesting instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGamemodesurvival!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		entity.setFire((int) 5);
	}
}
