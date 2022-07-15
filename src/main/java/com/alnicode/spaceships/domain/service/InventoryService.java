package com.alnicode.spaceships.domain.service;

import com.alnicode.spaceships.domain.dto.inventory.InventoryRequest;
import com.alnicode.spaceships.domain.dto.inventory.InventoryResponse;
import java.util.Optional;

/**
 * The inventory service template.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface InventoryService extends GenericService<InventoryRequest, InventoryResponse> {

    /**
     * Find an inventory by the name.
     *
     * @param name the name to search.
     * @return an optional of the inventory found.
     */
    Optional<InventoryResponse> findByName(String name);

    /**
     * Find an inventory by the spacecraft id.
     *
     * @param spacecraftId the spacecraft id to search.
     * @return an optional of the inventory found.
     */
    Optional<InventoryResponse> findBySpacecraftsId(long spacecraftId);

}
