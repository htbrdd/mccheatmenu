package net.mcreator.guitesting;

import net.minecraft.entity.Entity;

@Elementsguitesting.ModElement.Tag
public class MCreatorTimesetnight extends Elementsguitesting.ModElement {
	public MCreatorTimesetnight(Elementsguitesting instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTimesetnight!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			entity.world.getServer().getCommandManager()
					.handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "time set 18000");
		}
	}
}
