package com.alnicode.spaceships.domain.dto.inventory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The {@code Inventory} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public class InventoryRequest {

    private final String name;

}
