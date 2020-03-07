package net.mcreator.guitesting;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

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
		if (entity instanceof ServerPlayerEntity) {
			Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager().getAdvancement(
					new ResourceLocation("guitesting:cheatmenuget"));
			AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemaningCriteria().iterator();
				while (_iterator.hasNext()) {
					String _criterion = (String) _iterator.next();
					((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
				}
			}
		}
	}
}
