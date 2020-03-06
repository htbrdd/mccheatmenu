package net.mcreator.guitesting;

import net.minecraft.entity.Entity;

@Elementsguitesting.ModElement.Tag
public class MCreatorCheatmenustartprocedure extends Elementsguitesting.ModElement {
	public MCreatorCheatmenustartprocedure(Elementsguitesting instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCheatmenustartprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			entity.world.getServer().getCommandManager()
					.handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "cheatmenustart");
		}
	}
}
