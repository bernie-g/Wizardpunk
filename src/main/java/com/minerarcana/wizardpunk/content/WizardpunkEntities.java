package com.minerarcana.wizardpunk.content;

import com.minerarcana.wizardpunk.Wizardpunk;
import com.minerarcana.wizardpunk.entity.friendly.MiniCatEntity;
import com.minerarcana.wizardpunk.entity.friendly.OppressedVillagerEntity;
import com.minerarcana.wizardpunk.entity.neutral.ZephyrusEntity;
import com.minerarcana.wizardpunk.entity.oppressor.DRMGolemEntity;
import com.minerarcana.wizardpunk.entity.oppressor.EnforcerEntity;
import com.minerarcana.wizardpunk.entity.oppressor.WarPigEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WizardpunkEntities {
    private static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
            Wizardpunk.ID);

    public static final RegistryObject<EntityType<DRMGolemEntity>> DRM_GOLEM = ENTITIES.register("drm_golem",
            () -> EntityType.Builder.create(DRMGolemEntity::new, EntityClassification.MISC)
                    .size(1.4F, 2.7F)
                    .build("drm_golem"));

    public static final RegistryObject<EntityType<WarPigEntity>> WAR_PIG = ENTITIES.register("war_pig",
            () -> EntityType.Builder.create(WarPigEntity::new, EntityClassification.MONSTER)
                    .size(1.95F, 2.2F)
                    .build("war_pig"));

    public static final RegistryObject<EntityType<EnforcerEntity>> ENFORCER = ENTITIES.register("enforcer",
            () -> EntityType.Builder.create(EnforcerEntity::new, EntityClassification.MISC)
                    .size(0.6F, 1.95F)
                    .build("enforcer"));

    public static final RegistryObject<EntityType<MiniCatEntity>> MINI_CAT = ENTITIES.register("mini_cat",
            () -> EntityType.Builder.create(MiniCatEntity::new, EntityClassification.MISC)
                    .size(0.3F, 0.4F)
                    .build("mini_cat"));

    public static final RegistryObject<EntityType<ZephyrusEntity>> ZEPHYRUS = ENTITIES.register("zephyrus",
            () -> EntityType.Builder.create(ZephyrusEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F).build("zephyrus"));

    public static final RegistryObject<EntityType<OppressedVillagerEntity>> OPPRESSED_VILLAGER = ENTITIES.register(
            "oppressed_villager", () -> EntityType.Builder.<OppressedVillagerEntity>create(
                    OppressedVillagerEntity::new, EntityClassification.MISC)
                    .size(0.6F, 1.95F)
                    .build("oppressed_villager"));

    public static void register(IEventBus modBus) {
        ENTITIES.register(modBus);
    }
}
