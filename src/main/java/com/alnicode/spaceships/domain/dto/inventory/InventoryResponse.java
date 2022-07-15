package com.alnicode.spaceships.domain.dto.inventory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The {@code Inventory} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public class InventoryResponse {

    private final long id;
    private final String name;

}
