package com.alnicode.spaceships.model.domain.dto.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code Inventory} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Setter
@Getter
public class InventoryRequest {

    private String name;

}
