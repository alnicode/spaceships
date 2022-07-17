package com.alnicode.spaceships.view;

import com.alnicode.spaceships.model.domain.dto.inventory.InventoryRequest;

/**
 * The inventory UI menu.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class InventoryUI {

    public static void register() {
        System.out.println("\n# ----- INVENTORY REGISTER ----- #\n\n" +
                "Please, complete the required data:\n");

        final var request = new InventoryRequest();

        final var name = UtilsUI.response("Name:");

        request.setName(name);

        System.out.println("Inventory successfully registered!");

        MenuUI.showMenu();
    }

}
