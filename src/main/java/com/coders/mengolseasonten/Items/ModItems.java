package com.coders.mengolseasonten.Items;

import com.coders.mengolseasonten.Items.custom.ItemBrush;
import com.coders.mengolseasonten.MengolMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MengolMod.MOD_ID);

    public static final RegistryObject<Item> BRUSH = ITEMS.register("brush",
            () -> new ItemBrush(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);


    }
}
