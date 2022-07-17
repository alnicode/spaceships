package com.alnicode.spaceships.model.domain.service;

import com.alnicode.spaceships.model.domain.dto.inventory.InventoryRequest;
import com.alnicode.spaceships.model.domain.dto.inventory.InventoryResponse;
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
     * Find an inventory by the spacecraft id.
     *
     * @param spacecraftId the spacecraft id to search.
     * @return an optional of the inventory found.
     */
    Optional<InventoryResponse> getBySpacecraftsId(long spacecraftId);

}
